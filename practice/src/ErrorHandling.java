import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ErrorHandling {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        File myFile = new File("practice.iml");
        
        System.out.println(myFile.exists());
        System.out.println(myFile.canRead() + "," + myFile.canWrite());

        try {
            Scanner anotherScanner = new Scanner(myFile);
            while (anotherScanner.hasNext()) {
                System.out.println(anotherScanner.nextLine());
            }
            anotherScanner.close();
        } catch (IOException ex) {

        } /*catch (Exception ex) {

        }*/



    }
}
