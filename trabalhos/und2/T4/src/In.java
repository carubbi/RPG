import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Locale;
import java.util.Scanner;

public class In {
    private final Scanner scanner;

    public In(String filePath) {
        try {
            this.scanner = new Scanner(new File(filePath));
            this.scanner.useLocale(Locale.US);
        }
        catch (FileNotFoundException exception) {
            throw new IllegalArgumentException("nao foi possivel abrir o arquivo: " + filePath, exception);
        }
    }

    public boolean isEmpty() {
        return !scanner.hasNext();
    }

    public int readInt() {
        try {
            return scanner.nextInt();
        }
        catch (NoSuchElementException exception) {
            throw new IllegalStateException("faltam inteiros no arquivo de entrada", exception);
        }
    }

    public double readDouble() {
        try {
            return scanner.nextDouble();
        }
        catch (NoSuchElementException exception) {
            throw new IllegalStateException("faltam valores reais no arquivo de entrada", exception);
        }
    }
}
