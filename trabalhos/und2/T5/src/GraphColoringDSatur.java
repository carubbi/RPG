public class GraphColoringDSatur {
    private final Graph graph;

    public GraphColoringDSatur(Graph graph) {
        if (graph == null) {
            throw new IllegalArgumentException("graph nao pode ser nulo");
        }
        this.graph = graph;
    }

    public Graph getGraph() {
        return graph;
    }

    public void color() {
        throw new UnsupportedOperationException("TODO: implementar o algoritmo DSatur");
    }

    public int getColor(int vertex) {
        throw new UnsupportedOperationException("TODO: informar a cor atribuida ao vertice");
    }

    public int getColorCount() {
        throw new UnsupportedOperationException("TODO: informar o total de cores utilizadas");
    }

    public int[] getColoringOrder() {
        throw new UnsupportedOperationException("TODO: informar a ordem de coloracao");
    }

    public boolean isValidColoring() {
        throw new UnsupportedOperationException("TODO: validar a coloracao produzida");
    }

    public String getLabel(int vertex) {
        throw new UnsupportedOperationException("TODO: mapear o rotulo do vertice para exibicao");
    }
}
