package fileIO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileIO {

  public static void copyFromAFileToAnother (String myPath, String myPath2) {
    Path path1 = Paths.get(myPath);
    Path path2 = Paths.get(myPath2);

    try {
      List<String> listToUse = Files.readAllLines(path1); //!!
      Files.write(path2, listToUse);
    } catch (Exception e) {
      System.out.println("oops " + e.getMessage());
    }
  }

}
