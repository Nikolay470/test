package fileTest;

import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    public FileWriter writer;

    public Logger(String path) throws IOException {
        this.writer = new FileWriter(path);
    }

}
