/* *****************************************************************************
 *  Name:    Jeremie Lumbroso
 *  NetID:   lumbroso
 *  Precept: P99
 *
 *  Partner Name:    Donna Gabai
 *  Partner NetID:   dgabai
 *  Partner Precept: P99
 *
 *  Description:  Implements an interactive client that builds a Tour using
 *                either the nearest heuristic (red) or the smallest heuristic
 *                (blue).
 *
 *                Can be called with or without an input file to begin:
 *
 *                  java-introcs TSPVisualizer tsp1000.txt
 *
 *                Keyboard commands:
 *                  - n   toggle nearest heuristic tour
 *                  - s   toggle smallest heuristic tour
 *                  - m   toggle mouse up correction (what does this do... ?)
 *                  - q   quit (no!)
 *
 *  Dependencies: Point, StdOut, StdDraw
 **************************************************************************** */

import java.util.ArrayList;
import java.util.List;

public class TSPVisualizer {
    private static final int BORDER = 70;

    public static void showTours(int width, int height, List<Point> points, Tour nearest, Tour smallest) {
        StdDraw.setCanvasSize(width, height + BORDER);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(-BORDER, height);
        StdDraw.enableDoubleBuffering();
        render(points, nearest, smallest);
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            throw new IllegalArgumentException(
                    "informe o arquivo de entrada. Ex.: java TSPVisualizer ../dados/entrada_oficial.txt"
            );
        }

        In in = new In(args[0]);
        int width = in.readInt();
        int height = in.readInt();
        ArrayList<Point> points = new ArrayList<>();
        Tour nearest = new Tour();
        Tour smallest = new Tour();

        try {
            while (!in.isEmpty()) {
                Point p = new Point(in.readDouble(), in.readDouble());
                points.add(p);
                nearest.insertNearest(p);
                smallest.insertSmallest(p);
            }
        }
        catch (UnsupportedOperationException exception) {
            StdOut.println("Implementacao pendente em Tour.java:");
            StdOut.println(exception.getMessage());
            return;
        }

        showTours(width, height, points, nearest, smallest);
    }

    private static void render(List<Point> points, Tour nearest, Tour smallest) {
        StdDraw.clear();
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.setPenRadius(0.004);
        nearest.draw();

        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.setPenRadius(0.003);
        smallest.draw();

        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setPenRadius(0.005);
        for (Point p : points) {
            p.draw();
        }

        StdDraw.textLeft(10, -10, "num points: " + points.size());
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.textLeft(10, -35, String.format("nearest: %.4f", nearest.length()));
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.textLeft(10, -60, String.format("smallest: %.4f", smallest.length()));
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.show();
    }
}
