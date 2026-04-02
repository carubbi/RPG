import java.util.NoSuchElementException;
import java.util.Locale;
import java.util.Scanner;

public final class StdIn {
    private static final Scanner SCANNER = new Scanner(System.in);

    static {
        SCANNER.useLocale(Locale.US);
    }

    private StdIn() {
    }

    public static boolean isEmpty() {
        return !SCANNER.hasNext();
    }

    public static int readInt() {
        try {
            return SCANNER.nextInt();
        }
        catch (NoSuchElementException exception) {
            throw new IllegalStateException("faltam inteiros na entrada padrao", exception);
        }
    }

    public static double readDouble() {
        try {
            return SCANNER.nextDouble();
        }
        catch (NoSuchElementException exception) {
            throw new IllegalStateException("faltam valores reais na entrada padrao", exception);
        }
    }
}
