import algs4.Biconnected;
import algs4.Bridge;
import algs4.Graph;

public final class BridgeBiconnectedTest {
    private BridgeBiconnectedTest() {
    }

    private static void assertEquals(int expected, int actual, String message) {
        if (expected != actual) {
            throw new AssertionError(message + ": esperado " + expected + ", obtido " + actual);
        }
    }

    private static void assertEquals(boolean expected, boolean actual, String message) {
        if (expected != actual) {
            throw new AssertionError(message + ": esperado " + expected + ", obtido " + actual);
        }
    }

    private static Graph connectedGraph() {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 2);
        return graph;
    }

    private static void countsTwoEdgeConnectedComponents() {
        Bridge bridge = new Bridge(connectedGraph());
        assertEquals(3, bridge.components(), "componentes após remover as pontes");
    }

    private static void identifiesNonRootArticulationVertices() {
        Biconnected biconnected = new Biconnected(connectedGraph());
        boolean[] expected = {false, true, true, false, false};

        for (int vertex = 0; vertex < expected.length; vertex++) {
            assertEquals(
                expected[vertex],
                biconnected.isArticulation(vertex),
                "articulação no vértice " + vertex
            );
        }
    }

    private static void identifiesRootArticulationVertex() {
        Graph star = new Graph(4);
        star.addEdge(0, 1);
        star.addEdge(0, 2);
        star.addEdge(0, 3);

        Biconnected biconnected = new Biconnected(star);

        assertEquals(true, biconnected.isArticulation(0), "raiz com três filhos");
        assertEquals(false, biconnected.isArticulation(1), "folha 1");
        assertEquals(false, biconnected.isArticulation(2), "folha 2");
        assertEquals(false, biconnected.isArticulation(3), "folha 3");
    }

    public static void main(String[] args) {
        countsTwoEdgeConnectedComponents();
        identifiesNonRootArticulationVertices();
        identifiesRootArticulationVertex();
        System.out.println("BridgeBiconnectedTest: OK");
    }
}
