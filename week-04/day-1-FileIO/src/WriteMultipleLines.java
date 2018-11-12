import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class WriteMultipleLines {
    // Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number paramter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error if it could not write the file

    public static void main(String[] args) {
        String myPath = "myfile.txt";
        String myWord = "blabla";
        int myNumber = 5;

        myFunction(myPath, myWord, myNumber);
    }

    public static void myFunction (String myPath, String myWord, int myNumber ) {
        List<String> content = new ArrayList();

        for (int i = 0; i < myNumber; i++) {
            content.add(myWord);
        }

        Path newPath = Paths.get(myPath);

        try {
            Files.write(newPath, content);
        } catch (Exception e) {
          System.out.println("");
        }

    }
}
