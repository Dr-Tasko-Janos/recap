package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class ByteWriter {

    public static void main(String[] args) {

        Path file = Path.of("ByteWriter.dat");

        try {
            Files.write(file, new byte[] {97, 98, 99});
        }
        catch (IOException ioe) {
            throw new IllegalStateException("File can not write", ioe);
        }

        try {
            byte[] content = Files.readAllBytes(file);
            System.out.println(Arrays.toString(content));
        } catch (IOException ioe) {
            throw new IllegalStateException("File can not read", ioe);
        }


    }
}
