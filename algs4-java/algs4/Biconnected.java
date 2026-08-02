/******************************************************************************
 *  Adapted for package algs4 from Biconnected.java, Algorithms, 4th Edition.
 *  Original source:
 *  https://algs4.cs.princeton.edu/41graph/Biconnected.java.html
 *  Copyright (c) 2000-2019 Robert Sedgewick and Kevin Wayne.
 *
 *  Identifies articulation vertices in a simple undirected graph using
 *  depth-first search. Runs in O(V + E) time and uses O(V) extra space.
 ******************************************************************************/

package algs4;

/**
 * Identifies the articulation vertices of a simple undirected graph.
 * An articulation vertex is a vertex whose removal increases the number of
 * connected components.
 * <p>
 * This implementation is based on the DFS implementation by Robert Sedgewick
 * and Kevin Wayne for Section 4.1 of <i>Algorithms, 4th Edition</i>.
 *
 * @author Robert Sedgewick
 * @author Kevin Wayne
 */
public class Biconnected {
    private final int[] low;
    private final int[] preorder;
    private final boolean[] articulation;
    private int preorderCounter;

    /**
     * Computes the articulation vertices of the specified simple undirected
     * graph.
     *
     * @param graph the graph
     * @throws IllegalArgumentException if {@code graph} is {@code null}
     */
    public Biconnected(Graph graph) {
        if (graph == null) throw new IllegalArgumentException("argument is null");

        low = new int[graph.V()];
        preorder = new int[graph.V()];
        articulation = new boolean[graph.V()];
        for (int vertex = 0; vertex < graph.V(); vertex++) {
            low[vertex] = -1;
            preorder[vertex] = -1;
        }

        for (int vertex = 0; vertex < graph.V(); vertex++) {
            if (preorder[vertex] == -1) {
                dfs(graph, vertex, vertex);
            }
        }
    }

    private void dfs(Graph graph, int parent, int vertex) {
        int children = 0;
        preorder[vertex] = preorderCounter++;
        low[vertex] = preorder[vertex];

        for (int adjacent : graph.adj(vertex)) {
            if (preorder[adjacent] == -1) {
                children++;
                dfs(graph, vertex, adjacent);
                low[vertex] = Math.min(low[vertex], low[adjacent]);

                if (parent != vertex && low[adjacent] >= preorder[vertex]) {
                    articulation[vertex] = true;
                }
            }
            else if (adjacent != parent) {
                low[vertex] = Math.min(low[vertex], preorder[adjacent]);
            }
        }

        if (parent == vertex && children > 1) {
            articulation[vertex] = true;
        }
    }

    /**
     * Returns whether the specified vertex is an articulation vertex.
     *
     * @param vertex the vertex
     * @return {@code true} if the vertex is an articulation vertex
     * @throws IllegalArgumentException unless {@code 0 <= vertex < V}
     */
    public boolean isArticulation(int vertex) {
        validateVertex(vertex);
        return articulation[vertex];
    }

    private void validateVertex(int vertex) {
        int vertices = articulation.length;
        if (vertex < 0 || vertex >= vertices) {
            throw new IllegalArgumentException(
                "vertex " + vertex + " is not between 0 and " + (vertices - 1)
            );
        }
    }

    /**
     * Generates a random simple graph and reports its articulation vertices.
     *
     * @param args the number of vertices and edges
     */
    public static void main(String[] args) {
        int vertices = Integer.parseInt(args[0]);
        int edges = Integer.parseInt(args[1]);
        Graph graph = GraphGenerator.simple(vertices, edges);
        StdOut.println(graph);

        Biconnected biconnected = new Biconnected(graph);
        StdOut.println("Articulation vertices");
        StdOut.println("---------------------");
        for (int vertex = 0; vertex < graph.V(); vertex++) {
            if (biconnected.isArticulation(vertex)) {
                StdOut.println(vertex);
            }
        }
    }
}
