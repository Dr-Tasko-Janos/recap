package files;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class PracticeInputStream {

    public static void main(String[] args) {

        Path file = Path.of("PracticeInputStream.txt");

        byte[] numbers = new byte[5500];
        for (int i = 0; i < 5500; i++) {
            numbers[i] = 97;
        }

        try {
            Files.write(file, numbers);
        }
        catch(IOException ioe) {
            throw new IllegalStateException("File can not write");
        }


        try (InputStream inputStream = new BufferedInputStream(Files.newInputStream(file))) {
            byte[] content = inputStream.readAllBytes();
            System.out.println(Arrays.toString(content));
            System.out.println(content.length);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("File can not read", ioe);
        }




        //

        System.out.println("InputStream Example2: ");

        try (InputStream inputStream = Files.newInputStream(file)) {
            byte[] buffer = new byte[1000];
            inputStream.read(buffer);
            System.out.println(Arrays.toString(buffer));
        } catch (IOException ioe) {
            throw new IllegalStateException("File can not read", ioe);
        }

        //
        System.out.println("\nInputStream Example3: \n");

        try (InputStream inputStream = new BufferedInputStream(Files.newInputStream(file))) {
            byte[] buffer = new byte[1000];
            int size;
            while ((size = inputStream.read(buffer)) > 0) {
                System.out.println(Arrays.toString(buffer));
                System.out.println(size);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("File can not write", ioe);
        }
    }
}
