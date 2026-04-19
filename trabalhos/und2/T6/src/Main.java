public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            throw new IllegalArgumentException(
                    "informe dois arquivos de entrada. Ex.: java Main ../dados/arvore1.txt ../dados/arvore2.txt"
            );
        }

        Graph tree1 = new Graph(new In(args[0]));
        Graph tree2 = new Graph(new In(args[1]));

        StdOut.println("Arvore 1:");
        StdOut.println(tree1);
        StdOut.println();

        StdOut.println("Arvore 2:");
        StdOut.println(tree2);
        StdOut.println();

        TreeIsomorphism analysis1 = new TreeIsomorphism(tree1);
        TreeIsomorphism analysis2 = new TreeIsomorphism(tree2);

        StdOut.println("TODO: complete a validacao das entradas, o calculo dos centros,");
        StdOut.println("a codificacao canonica e o veredito final de isomorfismo.");

        // Exemplo de chamadas esperadas apos a implementacao:
        // StdOut.println(analysis1.getValidationMessage());
        // StdOut.println(analysis2.getValidationMessage());
        // StdOut.println(analysis1.getCanonicalEncoding());
        // StdOut.println(analysis2.getCanonicalEncoding());
    }
}
