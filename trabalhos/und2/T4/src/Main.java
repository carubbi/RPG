import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            throw new IllegalArgumentException(
                    "informe o arquivo de entrada. Ex.: java Main ../dados/entrada_oficial.txt"
            );
        }

        In in = new In(args[0]);
        int width = in.readInt();
        int height = in.readInt();

        List<Point> points = new ArrayList<>();
        while (!in.isEmpty()) {
            points.add(new Point(in.readDouble(), in.readDouble()));
        }

        StdOut.println("Instancia TSP carregada:");
        StdOut.println("- dimensoes: " + width + " x " + height);
        StdOut.println("- numero de pontos: " + points.size());

        Tour nearest = new Tour();
        Tour smallest = new Tour();

        try {
            for (Point point : points) {
                nearest.insertNearest(point);
                smallest.insertSmallest(point);
            }
        }
        catch (UnsupportedOperationException exception) {
            StdOut.println();
            StdOut.println("Implementacao pendente em Tour.java:");
            StdOut.println(exception.getMessage());
            StdOut.println("Complete insertNearest e insertSmallest e execute novamente.");
            return;
        }

        StdOut.println();
        StdOut.printf("Nearest insertion: tamanho = %d, comprimento = %.4f\n",
                nearest.size(), nearest.length());
        StdOut.printf("Smallest insertion: tamanho = %d, comprimento = %.4f\n",
                smallest.size(), smallest.length());

        TSPVisualizer.showTours(width, height, points, nearest, smallest);
    }
}
