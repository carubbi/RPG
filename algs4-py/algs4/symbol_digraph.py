"""
   Execution:    python -m algs4.symbol_digraph filename.txt delimiter queries.txt
   Data files:   ../dataset/routes.txt
                 ../dataset/airports.txt

   %  python -m algs4.symbol_digraph ../dataset/routes.txt " " ../dataset/airports.txt
      MCO
      HOU
      LAS
      PHX


 """

from algs4.st import ST
from algs4.digraph import Digraph


class SymbolDigraph:

    def __init__(self, stream, sp):
        self.st = ST()

        for line in open(stream):
            a = line.strip().split(sp)
            for i in range(len(a)):
                if not self.st.contains(a[i]):
                    self.st.put(a[i], self.st.size())

        self.keys = ["" for _ in range(self.st.size())]
        for key in self.st.keys():
            self.keys[self.st.get(key)] = key

        self.G = Digraph(self.st.size())
        for line in open(stream):
            a = line.strip().split(sp)
            v = self.st.get(a[0])
            for i in range(1, len(a)):
                self.G.add_edge(v, self.st.get(a[i]))

    def contains(self, s):
        return self.st.contains(s)

    def index(self, s):
        return self.st.get(s)

    def name(self, v):
        return self.keys[v]

    def digraph(self):
        return self.G


if __name__ == "__main__":
    import sys
    filename, delimiter, queries = sys.argv[1], sys.argv[2], sys.argv[3]
    sg = SymbolDigraph(filename, delimiter)
    graph = sg.digraph()

    for line in open(queries):
        source = line.strip()
        if sg.contains(source):
            s = sg.index(source)
            for v in graph.adj[s]:
                print("  ", sg.name(v), end='')
        else:
            print("input not contains source: ", source)
