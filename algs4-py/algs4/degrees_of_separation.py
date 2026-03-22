"""
      Execution:
        python -m algs4.degrees_of_separation filename delimiter source queries.txt
      Data files:   ../dataset/routes.txt
                    ../dataset/airports.txt
    
    
     % python -m algs4.degrees_of_separation ../dataset/routes.txt " " "JFK" ../dataset/airports.txt
      ATL
         JFK
         ATL
      DEN
         JFK
         ORD
         DEN
      LAX
         JFK
         ORD
         PHX
         LAX
    
"""
from algs4.symbol_graph import SymbolGraph
from algs4.breadth_first_paths import BreadthFirstPaths

if __name__ == "__main__":
    import sys
    filename, delimiter, source, queries = sys.argv[1], sys.argv[2], sys.argv[3], sys.argv[4]
    sg = SymbolGraph(filename, delimiter)
    graph = sg.graph()

    if not sg.contains(source):
        print(source, " not in database.")
    else:
        s = sg.index(source)
        bfs = BreadthFirstPaths(graph, s)

        for line in open(queries):
            sink = line.strip()
            if sg.contains(sink):
                t = sg.index(sink)
                if bfs.has_path_to(t):
                    for v in bfs.path_to(t):
                        print(" ", sg.name(v))
                else:
                    print("not connected")
            else:
                print("input not contains source: ", source)
