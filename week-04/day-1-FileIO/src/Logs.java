import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Logs {

    // Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio

    public static void main(String[] args) {
        String myFile = "log.txt";
        System.out.println(arrayReturn(myFile));
        System.out.println(getPostRatio(myFile));
    }

    public static ArrayList<String> arrayReturn (String myFile){
        Path logFile = Paths.get(myFile);
        ArrayList<String> uniqueID = new ArrayList<>();

        try {
            List<String> logList = Files.readAllLines(logFile);
            for (String lines : logList) {
                uniqueID.add(lines.substring(27, 38));
            }
        } catch (Exception e) {
            System.out.println("alert");
        }

        Set<String> hs = new HashSet<>();
        hs.addAll(uniqueID);
        uniqueID.clear();
        uniqueID.addAll(hs);

        return uniqueID;
    }

    public static double getPostRatio (String myFile){
        Path logFile = Paths.get(myFile);
        double ratio;
        ArrayList<String> getArray = new ArrayList<>();
        ArrayList<String> postArray = new ArrayList<>();

        try {
            List<String> logList = Files.readAllLines(logFile);
            for (String line : logList) {
                if (line.contains("GET")) {
                    getArray.add(line);
                } else {
                    postArray.add(line);
                }
            }
        } catch (ArithmeticException e) {
            System.out.println("alert");
        } catch (IOException io) {
            System.out.println("IO exception");
        }

        ratio = (double) getArray.size() / (double) postArray.size();

        return ratio;
    }
}
