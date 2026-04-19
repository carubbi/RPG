public class TreeIsomorphism {
    private final Graph graph;

    public TreeIsomorphism(Graph graph) {
        if (graph == null) {
            throw new IllegalArgumentException("graph nao pode ser nulo");
        }
        this.graph = graph;
    }

    public Graph getGraph() {
        return graph;
    }

    public boolean isTree() {
        throw new UnsupportedOperationException("TODO: validar se o grafo representa uma arvore");
    }

    public String getValidationMessage() {
        throw new UnsupportedOperationException("TODO: descrever o resultado da validacao da entrada");
    }

    public int[] getCenters() {
        throw new UnsupportedOperationException("TODO: encontrar o(s) centro(s) da arvore");
    }

    public String getCanonicalEncoding() {
        throw new UnsupportedOperationException("TODO: gerar a codificacao canonica da arvore");
    }
}
