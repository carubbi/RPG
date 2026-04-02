/* *****************************************************************************
 * Name: Hasit Nanda
 * NetID:
 * Precept:
 *
 * Description: This class defines the tour data type by implementing a Circular
 * Linked List and defining methods to allow for the implementation of two
 * heuristics to find good solutions to the TSP.
 **************************************************************************** */

public class Tour {
    private class Node {
        private Point p; // point value of node
        private Node next; // pointer to next Node
    }

    private Node start; // first Node in Linked List

    // creates an empty tour
    public Tour() {
        start = new Node();
    }

    // creates the 4-point tour a->b->c->d->a (for debugging)
    public Tour(Point a, Point b, Point c, Point d) {
        start = new Node();
        Node b1 = new Node();
        Node c1 = new Node();
        Node d1 = new Node();
        start.p = a;
        b1.p = b;
        c1.p = c;
        d1.p = d;
        start.next = b1;
        b1.next = c1;
        c1.next = d1;
        d1.next = start;
    }

    // returns the number of points in this tour
    public int size() {
        if (start.p == null) {
            return 0;
        }
        else {
            int counter = 0;
            Node current = start;
            do {
                current = current.next;
                counter += 1;
            } while (!current.equals(start));
            return counter;
        }
    }

    // returns the length of this tour
    public double length() {
        if (start.p == null) {
            return 0.0;
        }
        else {
            double distance = 0.0;
            Node current = start;
            do {
                distance += current.p.distanceTo(current.next.p);
                current = current.next;
            } while (!current.equals(start));

            return distance;
        }

    }

    // returns a string representation of this tour
    public String toString() {
        if (start.p == null) {
            return "";
        }
        else {
            Node current = start;
            StringBuilder str = new StringBuilder();
            do {
                str.append(current.p.toString() + "\n");
                current = current.next;
            } while (!current.equals(start));
            return str.toString();
        }
    }

    // draws this tour to standard drawing
    public void draw() {
        if (start.p != null && start.next != null) {
            Node current = start;
            do {
                current.p.drawTo(current.next.p);
                current = current.next;
            } while (!current.equals(start));
        }
    }

    // inserts p using the nearest neighbor heuristic
    public void insertNearest(Point p) {
        throw new UnsupportedOperationException(
                "TODO: implementar insertNearest(Point p) usando a heuristica nearest insertion"
        );
    }

    // inserts p using the smallest increase heuristic
    public void insertSmallest(Point p) {
        throw new UnsupportedOperationException(
                "TODO: implementar insertSmallest(Point p) usando a heuristica smallest insertion"
        );
    }

    // tests this class by calling all constructors and instance methods
    public static void main(String[] args) {
        // define 4 points, corners of a square
        Point a = new Point(1.0, 1.0);
        Point b = new Point(1.0, 4.0);
        Point c = new Point(4.0, 4.0);
        Point d = new Point(4.0, 1.0);

        // create the tour a -> b -> c -> d -> a
        Tour squareTour = new Tour(a, b, c, d);

        // print the size to standard output
        int size = squareTour.size();
        StdOut.println("# of points = " + size);

        // print the tour length to standard output
        double length = squareTour.length();
        StdOut.println("Tour length = " + length);

        // print the tour to standard output
        StdOut.println(squareTour);

        StdDraw.setXscale(0, 6);
        StdDraw.setYscale(0, 6);

        Point e = new Point(5.0, 6.0);
        squareTour.insertNearest(e);
        squareTour.insertSmallest(e);
        squareTour.draw();


    }
}
