package files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracticeGetResourceAsStream {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(PracticeGetResourceAsStream.class.getResourceAsStream("GetResourceAsStream.txt")))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("File can not reade", ioe);
        }
    }
}