import java.util.Scanner;

public class Square {
    // Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%%
// %    %
// %    %
// %    %
// %    %
// %%%%%%
//
// The square should have as many lines as the number was
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Number:");
        int myNumber = myScanner.nextInt();

        for (int i = 0; i < myNumber; i++) {
            System.out.print("%");
        }
        System.out.println("");

        for (int x = 0; x < myNumber - 2; x++) {
            System.out.print("%");
            for (int j = 0; j < myNumber - 2; j++) {
                System.out.print(" ");
            }
            System.out.print("%");
            System.out.println("");
        }

        for (int i = 0; i < myNumber; i++) {
            System.out.print("%");
        }



    }
}
