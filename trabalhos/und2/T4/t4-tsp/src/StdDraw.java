import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public final class StdDraw {
    public static final Color BLACK = Color.BLACK;
    public static final Color BLUE = Color.BLUE;
    public static final Color RED = Color.RED;

    private static final int DEFAULT_SIZE = 512;

    private static JFrame frame;
    private static DrawPanel panel;
    private static BufferedImage offscreenImage;
    private static Graphics2D offscreen;
    private static int canvasWidth = DEFAULT_SIZE;
    private static int canvasHeight = DEFAULT_SIZE;
    private static double xmin = 0.0;
    private static double xmax = DEFAULT_SIZE;
    private static double ymin = 0.0;
    private static double ymax = DEFAULT_SIZE;
    private static double penRadius = 0.002;
    private static boolean doubleBuffering = false;
    private static final Queue<Character> keysTyped = new ArrayDeque<>();
    private static boolean mousePressed = false;
    private static double mouseX = 0.0;
    private static double mouseY = 0.0;

    static {
        initCanvas();
    }

    private StdDraw() {
    }

    public static void setCanvasSize(int width, int height) {
        canvasWidth = width;
        canvasHeight = height;
        initCanvas();
    }

    public static void setXscale(double min, double max) {
        xmin = min;
        xmax = max;
    }

    public static void setYscale(double min, double max) {
        ymin = min;
        ymax = max;
    }

    public static void setPenRadius(double radius) {
        penRadius = radius;
    }

    public static void setPenColor(Color color) {
        offscreen.setColor(color);
    }

    public static void enableDoubleBuffering() {
        doubleBuffering = true;
    }

    public static void clear() {
        Color old = offscreen.getColor();
        offscreen.setColor(Color.WHITE);
        offscreen.fillRect(0, 0, canvasWidth, canvasHeight);
        offscreen.setColor(old);
    }

    public static void point(double x, double y) {
        double xs = scaleX(x);
        double ys = scaleY(y);
        double radius = Math.max(2.0, penRadius * Math.max(canvasWidth, canvasHeight));
        offscreen.fill(new Ellipse2D.Double(xs - radius / 2.0, ys - radius / 2.0, radius, radius));
        drawIfNeeded();
    }

    public static void line(double x0, double y0, double x1, double y1) {
        offscreen.setStroke(new BasicStroke((float) Math.max(1.0, penRadius * Math.max(canvasWidth, canvasHeight))));
        offscreen.draw(new Line2D.Double(scaleX(x0), scaleY(y0), scaleX(x1), scaleY(y1)));
        drawIfNeeded();
    }

    public static void textLeft(double x, double y, String text) {
        float xs = (float) scaleX(x);
        float ys = (float) scaleY(y);
        FontMetrics metrics = offscreen.getFontMetrics();
        offscreen.drawString(text, xs, ys + metrics.getAscent() / 2.0f);
        drawIfNeeded();
    }

    public static void show() {
        if (panel != null) {
            panel.repaint();
        }
    }

    public static void pause(int millis) {
        try {
            Thread.sleep(millis);
        }
        catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
        }
    }

    public static boolean hasNextKeyTyped() {
        return !keysTyped.isEmpty();
    }

    public static char nextKeyTyped() {
        return keysTyped.remove();
    }

    public static boolean isMousePressed() {
        return mousePressed;
    }

    public static double mouseX() {
        return mouseX;
    }

    public static double mouseY() {
        return mouseY;
    }

    private static void drawIfNeeded() {
        if (!doubleBuffering) {
            show();
        }
    }

    private static void initCanvas() {
        if (SwingUtilities.isEventDispatchThread()) {
            buildCanvas();
        }
        else {
            try {
                SwingUtilities.invokeAndWait(StdDraw::buildCanvas);
            }
            catch (Exception exception) {
                throw new IllegalStateException("nao foi possivel inicializar o canvas", exception);
            }
        }
    }

    private static void buildCanvas() {
        offscreenImage = new BufferedImage(canvasWidth, canvasHeight, BufferedImage.TYPE_INT_ARGB);
        offscreen = offscreenImage.createGraphics();
        offscreen.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        offscreen.setColor(Color.WHITE);
        offscreen.fillRect(0, 0, canvasWidth, canvasHeight);
        offscreen.setColor(Color.BLACK);

        if (frame == null) {
            frame = new JFrame("T4 TSP Visualizer");
            panel = new DrawPanel();
            panel.setPreferredSize(new Dimension(canvasWidth, canvasHeight));
            panel.setFocusable(true);
            panel.addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent event) {
                    keysTyped.add(event.getKeyChar());
                }
            });
            MouseAdapter mouseAdapter = new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent event) {
                    mousePressed = true;
                    updateMouse(event);
                }

                @Override
                public void mouseReleased(MouseEvent event) {
                    mousePressed = false;
                    updateMouse(event);
                }

                @Override
                public void mouseDragged(MouseEvent event) {
                    updateMouse(event);
                }

                @Override
                public void mouseMoved(MouseEvent event) {
                    updateMouse(event);
                }
            };
            panel.addMouseListener(mouseAdapter);
            panel.addMouseMotionListener(mouseAdapter);
            frame.setContentPane(panel);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }
        else {
            panel.setPreferredSize(new Dimension(canvasWidth, canvasHeight));
            frame.pack();
        }

        panel.requestFocusInWindow();
        show();
    }

    private static void updateMouse(MouseEvent event) {
        mouseX = unscaleX(event.getX());
        mouseY = unscaleY(event.getY());
    }

    private static double scaleX(double x) {
        if (xmax == xmin) {
            return 0.0;
        }
        return canvasWidth * (x - xmin) / (xmax - xmin);
    }

    private static double scaleY(double y) {
        if (ymax == ymin) {
            return 0.0;
        }
        return canvasHeight - (canvasHeight * (y - ymin) / (ymax - ymin));
    }

    private static double unscaleX(double x) {
        return xmin + x * (xmax - xmin) / canvasWidth;
    }

    private static double unscaleY(double y) {
        return ymin + (canvasHeight - y) * (ymax - ymin) / canvasHeight;
    }

    private static final class DrawPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            graphics.drawImage(offscreenImage, 0, 0, null);
        }
    }
}
