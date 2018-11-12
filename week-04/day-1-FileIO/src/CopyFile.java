import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class CopyFile {
    // Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

    public static void main(String[] args) {
        String myPath = "my-file.txt";
        String myPath2 = "myfile.txt";

        System.out.println(copyIt(myPath, myPath2));
    }

    public static boolean copyIt (String myPath, String myPath2) {
        Path newPath1 = Paths.get(myPath);
        Path newPath2 = Paths.get(myPath2);

        try {
            List<String> nPList2 = Files.readAllLines(newPath2);
            Files.write(newPath1, nPList2);
            return true;
        } catch (Exception e) {
            return false;
        }

    }
}
