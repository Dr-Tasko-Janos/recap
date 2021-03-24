package files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class PracticeStringWriter {

    public void writeSomething(List<String> contentListToWriteOut, Writer writer) {
        PrintWriter printWriter = new PrintWriter(writer);
        for (String item : contentListToWriteOut) {
            printWriter.println(item + ", 131313");
        }
    }

    public static void main(String[] args) {

        List<String> namesToPrintOut = List.of("John Doe", "Jack Doe", "Jane Doe");

        Path file = Path.of("StringWriter.txt");
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(file)) {
            new PracticeStringWriter().writeSomething(namesToPrintOut, bufferedWriter);
        } catch (IOException ioe) {
            throw new IllegalStateException("File can not write", ioe);
        }

        //
        System.out.println("\nStringWriter Example2: \n");

        try (StringWriter stringWriter = new StringWriter()) {
            new PracticeStringWriter().writeSomething(namesToPrintOut, stringWriter);
            System.out.println(stringWriter.toString());
        } catch (IOException ioe) {
            throw new IllegalStateException("File can not write", ioe);
        }

        //

        System.out.println("\nStringWriter Example3: \n");

        StringWriter stringWriter = new StringWriter();
        try (stringWriter) {
            new PracticeStringWriter().writeSomething(namesToPrintOut, stringWriter);
        } catch (IOException ioe) {
            throw new IllegalStateException("File can not write", ioe);
        }
        System.out.println(stringWriter.toString());
    }
}
