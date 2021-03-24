package files;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class PracticePrintWriter {

    public static void main(String[] args) {

        List<String> names = List.of("John Doe", "Jack Doe", "Jane Doe");
        Path file = Path.of("PrintWriter.txt");

        try(PrintWriter writer = new PrintWriter(Files.newBufferedWriter(file))) {
            for(String name : names) {
                writer.print(name);
                writer.print(", ");
                writer.println(1234);
            }
        }
        catch(IOException ioe) {
            throw new IllegalStateException("File can not write", ioe);
        }
    }
}
