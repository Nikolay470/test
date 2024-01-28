package fileTest;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        try {
            reader = new FileReader("src/fileTest/log.txt");
        } catch (IOException e) {
            System.out.println("Исключение " + e.getClass().getSimpleName());
        }

        while (reader.ready()) {
            System.out.print((char) reader.read());
        }
    }
}
