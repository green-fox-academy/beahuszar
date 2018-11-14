import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class demoFileIO {
    public static void main(String[] args) {
        Path source = Paths.get("read.txt");
        Path output = Paths.get("write.txt");
        int[] numbers = {1, 2, 3, 4};
        try {
            // List<String> lines = Files.readAllLines(source);
            // Files.write(outpu, lines);
            System.out.println(numbers[5]);
            // throw new ArithmeticException();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds. Err: " + e);
        } catch (Exception e) {
            System.out.println("Error happened");
        } finally {
            System.out.println("Finally");
        }
        System.out.println("Afterwards");
    }
}
