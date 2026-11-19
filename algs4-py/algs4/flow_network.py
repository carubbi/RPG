"""
Execution:    python -m algs4.flow_network ../dataset/tinyFN.txt
Dependencies: algs4.flow_edge.FlowEdge
Data files:   ../dataset/tinyFN.txt

A capacitated flow network, implemented using adjacency lists
(port of FlowNetwork.java from algs4).

File format (the same as Java's `FlowNetwork(In in)`):

    V
    E
    u w capacity
    ...            (E lines)

Iteration order: `adj(v)` returns the adjacency list, which INSERTS AT THE
BEGINNING (`insert(0, e)`), the same semantics as Java's `Bag.add`
(`Node(item, oldfirst)`). Therefore, iterating `adj(v)` returns the edges in
REVERSE insertion order, and that order is what defines the augmenting path
chosen by Edmonds-Karp/Ford-Fulkerson.

% python -m algs4.flow_network ../dataset/tinyFN.txt
6 8
0:  0->2 0.0/3.0  0->1 0.0/2.0
1:  1->4 0.0/1.0  1->3 0.0/3.0
2:  2->4 0.0/1.0  2->3 0.0/1.0
3:  3->5 0.0/2.0
4:  4->5 0.0/3.0
5:
"""
import random
from pathlib import Path

# No Bag: lists with insertion at the beginning (LIFO), like Java's Bag.add.
from algs4.flow_edge import FlowEdge


def _read_file(path):
    """Reads V, E and E triples `u w capacity`, keeping the LINE of each token.

    Every error message cites the physical line number of the file, like the
    Java `In` does when reading token by token (here each token carries its
    line along). Blank lines and `#` comments are ignored.
    """
    tokens = []
    for number, raw in enumerate(
        Path(path).read_text(encoding="utf-8-sig").splitlines(), start=1
    ):
        clean = raw.split("#", 1)[0].strip()
        for piece in clean.split():
            tokens.append((number, piece))

    if len(tokens) < 2:
        raise ValueError("%s: incomplete file (expected V and E)" % path)

    def integer(position, label):
        number, piece = tokens[position]
        try:
            return int(piece)
        except ValueError:
            raise ValueError(
                "%s: line %d: %s is not an integer: %r" % (path, number, label, piece)
            )

    V = integer(0, "number of vertices")
    if V < 0:
        raise ValueError("%s: line %d: negative number of vertices (%d)"
                         % (path, tokens[0][0], V))
    E = integer(1, "number of edges")
    if E < 0:
        raise ValueError("%s: line %d: negative number of edges (%d)"
                         % (path, tokens[1][0], E))

    edges = []
    position = 2
    for i in range(E):
        if position + 3 > len(tokens):
            raise ValueError(
                "%s: line %d: edge %d incomplete (expected 'u w capacity')"
                % (path, tokens[-1][0], i)
            )
        v_line, v_text = tokens[position]
        w_line, w_text = tokens[position + 1]
        c_line, c_text = tokens[position + 2]
        position += 3
        try:
            v = int(v_text)
        except ValueError:
            raise ValueError("%s: line %d: invalid tail vertex: %r"
                             % (path, v_line, v_text))
        try:
            w = int(w_text)
        except ValueError:
            raise ValueError("%s: line %d: invalid head vertex: %r"
                             % (path, w_line, w_text))
        if v < 0 or v >= V:
            raise ValueError("%s: line %d: vertex %d out of range 0..%d"
                             % (path, v_line, v, V - 1))
        if w < 0 or w >= V:
            raise ValueError("%s: line %d: vertex %d out of range 0..%d"
                             % (path, w_line, w, V - 1))
        try:
            capacity = float(c_text)
        except ValueError:
            raise ValueError("%s: line %d: invalid capacity: %r"
                             % (path, c_line, c_text))
        if not (capacity >= 0.0):
            raise ValueError("%s: line %d: negative capacity: %r"
                             % (path, c_line, c_text))
        edges.append((v, w, capacity))
    return V, edges


class FlowNetwork:
    def __init__(self, v=0, e=None, **kwargs):
        """FlowNetwork(V) | FlowNetwork(V, E) random | FlowNetwork(file).

        `FlowNetwork(path)` / `FlowNetwork(file=path)` is equivalent to
        Java's `FlowNetwork(In in)`: V, E and E triples `u w capacity`.
        """
        file = kwargs.get("file", None)
        if isinstance(v, (str, Path)):
            file = v
            v = 0
        if file is not None:
            V, edges = _read_file(file)
            self.V = V
            self.E = 0
            self._adj = [[] for _ in range(self.V)]
            for a, b, capacity in edges:
                self.add_edge(FlowEdge(a, b, capacity))
            return
        if v < 0:
            raise ValueError("Number of vertices in a Graph must be non-negative")
        self.V = v
        self.E = 0
        self._adj = [[] for _ in range(self.V)]
        if e is not None:
            if e < 0:
                raise ValueError("Number of edges must be non-negative")
            for _ in range(e):
                a = random.randrange(self.V)
                b = random.randrange(self.V)
                capacity = float(random.randrange(100))
                self.add_edge(FlowEdge(a, b, capacity))

    def validate_vertex(self, v):
        if v < 0 or v >= self.V:
            raise ValueError("vertex " + str(v) + " is not between 0 and " + str(self.V - 1))

    def add_edge(self, e):
        v = e.from_()
        w = e.to()
        self.validate_vertex(v)
        self.validate_vertex(w)
        self._adj[v].insert(0, e)
        self._adj[w].insert(0, e)
        self.E += 1

    def adj(self, v):
        self.validate_vertex(v)
        return self._adj[v]

    def edges(self):
        # return list of all edges - excludes self loops
        result = []
        for v in range(self.V):
            for e in self.adj(v):
                if e.to() != v:
                    result.insert(0, e)
        return result

    def __str__(self):
        lines = ["%d %d" % (self.V, self.E)]
        for v in range(self.V):
            edges = []
            for e in self._adj[v]:
                if e.to() != v:
                    edges.append(str(e))
            lines.append("%d:  %s" % (v, "  ".join(edges)))
        return "\n".join(lines)


if __name__ == '__main__':
    import sys
    g = FlowNetwork(sys.argv[1])
    print(g)
