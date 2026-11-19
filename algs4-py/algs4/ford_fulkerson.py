"""
Execution:    python -m algs4.ford_fulkerson ../dataset/tinyFN.txt
Dependencies: algs4.flow_network.FlowNetwork, algs4.flow_edge.FlowEdge
Data files:   ../dataset/tinyFN.txt

Ford-Fulkerson algorithm for computing a max flow and a min cut using the
shortest augmenting path rule (port of FordFulkerson.java from algs4).

The augmenting-path search is a BFS (`has_augmenting_path`), i.e. this is the
Edmonds-Karp algorithm: each iteration picks a path with the FEWEST edges in
the residual network. The BFS has early exit, as in Java
(`while queue and not marked[t]`): it stops as soon as `t` is reached, without
sweeping the rest of the reachable part.

% python -m algs4.ford_fulkerson ../dataset/tinyFN.txt
Max flow from 0 to 5
   0->2 2.0/3.0
   ...
Min cut: 0 2
Max flow value = 4.0
"""
import sys
from collections import deque

from algs4.flow_network import FlowNetwork


class FordFulkerson:
    FLOATING_POINT_EPSILON = 1.0E-11

    def __init__(self, g, s, t):
        self.V = g.V
        self.validate(s)
        self.validate(t)
        if s == t:
            raise ValueError("Source equals sink")
        # Empty initial state (in Java the fields are born null/false).
        self.marked = [False] * self.V
        self.edgeTo = [None] * self.V
        self.value = 0.0
        if not self.is_feasible(g, s, t):
            raise ValueError("Initial flow is infeasible")

        # while there exists an augmenting path, use it
        self.value = self.excess(g, t)
        while self.has_augmenting_path(g, s, t):

            # compute bottleneck capacity
            bottle = float("inf")
            v = t
            while v != s:
                bottle = min(bottle, self.edgeTo[v].residual_capacity_to(v))
                v = self.edgeTo[v].other(v)

            # augment flow
            v = t
            while v != s:
                self.edgeTo[v].add_residual_flow_to(v, bottle)
                v = self.edgeTo[v].other(v)

            self.value += bottle

        # check optimality conditions
        assert self.check(g, s, t)

    def in_cut(self, v):
        self.validate(v)
        return self.marked[v]

    def validate(self, v):
        if v < 0 or v >= self.V:
            raise ValueError("vertex " + str(v) + " is not between 0 and " + str(self.V - 1))

    def has_augmenting_path(self, g, s, t):
        self.edgeTo = [None] * g.V
        self.marked = [False] * g.V

        # breadth-first search
        queue = deque()
        queue.append(s)
        self.marked[s] = True
        while queue and not self.marked[t]:
            v = queue.popleft()
            for e in g.adj(v):
                w = e.other(v)

                # if residual capacity from v to w
                if e.residual_capacity_to(w) > 0:
                    if not self.marked[w]:
                        self.edgeTo[w] = e
                        self.marked[w] = True
                        queue.append(w)

        # is there an augmenting path?
        return self.marked[t]

    def excess(self, g, v):
        # return excess flow at vertex v
        excess = 0.0
        for e in g.adj(v):
            if v == e.from_():
                excess -= e.flow
            else:
                excess += e.flow
        return excess

    def is_feasible(self, g, s, t):
        # check that capacity constraints are satisfied
        for v in range(g.V):
            for e in g.adj(v):
                if (e.flow < -self.FLOATING_POINT_EPSILON
                        or e.flow > e.capacity + self.FLOATING_POINT_EPSILON):
                    print("Edge does not satisfy capacity constraints: " + str(e), file=sys.stderr)
                    return False

        # check that net flow into a vertex equals zero, except at source and sink
        if abs(self.value + self.excess(g, s)) > self.FLOATING_POINT_EPSILON:
            print("Excess at source = " + str(self.excess(g, s)), file=sys.stderr)
            print("Max flow         = " + str(self.value), file=sys.stderr)
            return False
        if abs(self.value - self.excess(g, t)) > self.FLOATING_POINT_EPSILON:
            print("Excess at sink   = " + str(self.excess(g, t)), file=sys.stderr)
            print("Max flow         = " + str(self.value), file=sys.stderr)
            return False
        for v in range(g.V):
            if v == s or v == t:
                continue
            elif abs(self.excess(g, v)) > self.FLOATING_POINT_EPSILON:
                print("Net flow out of " + str(v) + " doesn't equal zero", file=sys.stderr)
                return False
        return True

    def check(self, g, s, t):
        # check that flow is feasible
        if not self.is_feasible(g, s, t):
            print("Flow is infeasible", file=sys.stderr)
            return False

        # check that s is on the source side of min cut and that t is not on source side
        if not self.in_cut(s):
            print("source " + str(s) + " is not on source side of min cut", file=sys.stderr)
            return False
        if self.in_cut(t):
            print("sink " + str(t) + " is on source side of min cut", file=sys.stderr)
            return False

        # check that value of min cut = value of max flow
        mincut_value = 0.0
        for v in range(g.V):
            for e in g.adj(v):
                if v == e.from_() and self.in_cut(e.from_()) and not self.in_cut(e.to()):
                    mincut_value += e.capacity
        if abs(mincut_value - self.value) > self.FLOATING_POINT_EPSILON:
            print("Max flow value = " + str(self.value) + ", min cut value = " + str(mincut_value), file=sys.stderr)
            return False

        return True


if __name__ == '__main__':
    # create flow network with V vertices and E edges
    g = FlowNetwork(sys.argv[1])
    s = 0
    t = g.V - 1
    print(g)

    # compute maximum flow and minimum cut
    maxflow = FordFulkerson(g, s, t)
    print("Max flow from " + str(s) + " to " + str(t))
    for v in range(g.V):
        for e in g.adj(v):
            if v == e.from_() and e.flow > 0:
                print("   " + str(e))

    # print min-cut
    print("Min cut: " + " ".join(str(v) for v in range(g.V) if maxflow.in_cut(v)))
    print("Max flow value = " + str(maxflow.value))
