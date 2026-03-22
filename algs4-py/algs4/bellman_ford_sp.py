from collections import deque

from algs4.edge_weighted_digraph import EdgeWeightedDigraph
from algs4.edge_weighted_directed_cycle import EdgeWeightedDirectedCycle

POSITIVE_INFINITY = 999999.0


class BellmanFordSP:
    def __init__(self, g, s):
        self.cost = 0
        self.cycle = None
        self.edgeTo = [None for _ in range(g.V)]
        self.distTo = [float("inf") for _ in range(g.V)]
        self.onQ = [False for _ in range(g.V)]
        for v in range(g.V):
            self.distTo[v] = POSITIVE_INFINITY
        self.distTo[s] = 0.0

        self.queue = deque([s])
        self.onQ[s] = True
        while self.queue and not self.has_negative_cycle():
            v = self.queue.popleft()
            self.onQ[v] = False
            self.relax(g, v)

    def relax(self, g, v):
        for e in g.adj[v]:
            w = e.To()
            if self.distTo[w] > self.distTo[v] + e.weight:
                self.distTo[w] = self.distTo[v] + e.weight
                self.edgeTo[w] = e
                if not self.onQ[w]:
                    self.queue.append(w)
                    self.onQ[w] = True
            self.cost += 1
            if self.cost % g.V == 0:
                self.find_negative_cycle()
                if self.has_negative_cycle():
                    return

    def find_negative_cycle(self):
        V = len(self.edgeTo)
        spt = EdgeWeightedDigraph(V)
        for v in range(V):
            if self.edgeTo[v] != None:
                spt.add_edge(self.edgeTo[v])
        finder = EdgeWeightedDirectedCycle(spt)
        self.cycle = finder.cycle()

    def has_negative_cycle(self):
        return self.cycle != None

    def has_path_to(self, v):
        return self.distTo[v] < POSITIVE_INFINITY

    def path_to(self, v):
        if not self.has_path_to(v):
            return None
        edges = []
        e = self.edgeTo[v]
        while e != None:
            edges.append(e)
            e = self.edgeTo[e.From()]
        return reversed(edges)
