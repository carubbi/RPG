public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            throw new IllegalArgumentException(
                    "informe o arquivo de entrada. Ex.: java Main ../dados/brasil.txt"
            );
        }

        In in = new In(args[0]);
        Graph graph = new Graph(in);
        GraphColoringDSatur dsatur = new GraphColoringDSatur(graph);

        StdOut.println("Grafo carregado:");
        StdOut.println(graph);
        StdOut.println();

        StdOut.println("TODO: implementar a execucao do DSatur.");
        StdOut.println("TODO: exibir a ordem de coloracao.");
        StdOut.println("TODO: exibir as cores finais de cada vertice.");
        StdOut.println("TODO: exibir o total de cores utilizadas.");
        StdOut.println("TODO: validar se a coloracao produzida eh valida.");

        // Exemplo de chamadas esperadas apos a implementacao:
        // dsatur.color();
        // int[] order = dsatur.getColoringOrder();
        // int totalColors = dsatur.getColorCount();
        // boolean valid = dsatur.isValidColoring();
    }
}
