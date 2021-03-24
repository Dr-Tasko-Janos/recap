package files;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class PracticeReadString {

    public static void main (String [] args) {

        Path file = Path.of("PracticeReadString.txt");

        try {
            String content = Files.readString(file, Charset.forName("ISO-8859-2"));
            System.out.println(content);
        }
        catch(IOException ioe) {
            throw new IllegalStateException("File can not read", ioe);
        }


        Charset charset = Charset.forName("ISO-8859-2");

       try {
           List<String> contentInList = Files.readAllLines(file, charset);
           System.out.println(contentInList);
       }
       catch(IOException ioe) {
           throw new IllegalStateException("File can not read", ioe);
       }
    }
}
