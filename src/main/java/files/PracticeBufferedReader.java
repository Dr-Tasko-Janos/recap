package files;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class PracticeBufferedReader {

    public static void main(String[] args) {

        Path file = Path.of("BufferedReader.txt");

        try (BufferedReader reader = Files.newBufferedReader(file)) {
            String line = reader.readLine();
            System.out.println(line);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("File can not read", ioe);
        }

        try (BufferedReader reader = Files.newBufferedReader(file)) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("File can not read", ioe);
        }
    }
}