import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    // Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.


    public static void main(String[] args) {
        String fileName = "my-file.txt";
        takesIt(fileName);

    }

    public static void takesIt (String filename) {
        Path filePath = Paths.get(filename);

        try {
            List<String> line = Files.readAllLines(filePath);
            System.out.println(line.size());
        } catch (IOException e) {
            System.out.println("0");
        }
    }
}

