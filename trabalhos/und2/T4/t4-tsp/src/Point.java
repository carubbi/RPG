/* *****************************************************************************
 *  Classe base local do Trabalho Pratico 4 para modelagem de pontos 2D.
 *
 *  Compilation:  javac Point.java
 *  Execution:    java Point < input.txt
 *
 *  Immutable data type for 2D points with floating-point coordinates.
 *
 **************************************************************************** */

public class Point { 
    private final double x;   // Cartesian
    private final double y;   // coordinates
   
    // creates and initializes a point with given (x, y)
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // returns the Euclidean distance between the two points
    public double distanceTo(Point that) {
        double dx = this.x - that.x;
        double dy = this.y - that.y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    // draws this point to standard drawing
    public void draw() {
        StdDraw.point(x, y);
    }

    // draws the line segment between the two points to standard drawing
    public void drawTo(Point that) {
        StdDraw.line(this.x, this.y, that.x, that.y);
    }

    // returns a string representation of this point
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}
