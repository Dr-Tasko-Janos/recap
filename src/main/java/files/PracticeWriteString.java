package files;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class PracticeWriteString {

    public static void main(String[] args) {

        Path file = Path.of("PracticeWriteString.txt");

        Charset standardCharsets = StandardCharsets.UTF_8;

        try {
            Files.writeString(file, "Hello World",standardCharsets, StandardOpenOption.APPEND);
        }
        catch(IOException ioe) {
            throw new IllegalStateException("File can not write", ioe);
        }
        try {
            String content = Files.readString(file);
            System.out.println(content);
        }
        catch(IOException ioe) {
            throw new IllegalStateException("File can not read", ioe);
        }

        Charset charset2 = Charset.forName("ISO-8859-2");
        try {
            Files.write(file, List.of("Jane Doe", "Jack Doe", "John Doe"), charset2);
        }
        catch(IOException ioe) {
            throw new IllegalStateException("File can not write", ioe);
        }

        try {
            List<String> content2 = Files.readAllLines(file);
            System.out.println(content2);
        }
        catch(IOException ioe) {
            throw new IllegalStateException("File can not read", ioe);
        }
    }
}
