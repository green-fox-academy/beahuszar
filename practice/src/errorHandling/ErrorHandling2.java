package errorHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ErrorHandling2 {
    public static void main(String[] args) {
       /* Path path = Paths.get("practice.iml");
        Files.isReadable(path);
        Files.isWritable(path);
        Files.isDirectory(path);*/

        try {
//            List<String> lines = Files.readAllLines(path);
          /*  Files.write(path, lines);
            Files.lines(path);*/
            for (String line : Files.readAllLines(Paths.get("practice.iml"))) {
                System.out.println(line.toUpperCase());
            }
            Files.lines(Paths.get("practice.iml"))

                .map(line -> line.toUpperCase())
                .filter(line -> !line.startsWith(" "))
                .forEach(line -> System.out.println(line));


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
