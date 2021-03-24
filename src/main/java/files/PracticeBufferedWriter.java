package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class PracticeBufferedWriter {

    public static void main(String[] args) {

        Path file = Path.of("BufferedWriter.txt");

        List<String> names = List.of("John Doe", "Jane Doe", "Jack Doe");

        try (BufferedWriter writer = Files.newBufferedWriter(file)) {
            for (String name : names) {
                writer.write(name + "\n");
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("File can not write", ioe);
        }

        try (BufferedReader reader = Files.newBufferedReader(file)) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("File can not read", ioe);
        }
    }
}
