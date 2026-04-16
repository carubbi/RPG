public final class StdOut {
    private StdOut() {
    }

    public static void println() {
        System.out.println();
    }

    public static void println(Object value) {
        System.out.println(value);
    }

    public static void printf(String format, Object... args) {
        System.out.printf(format, args);
    }
}
