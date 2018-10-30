import java.util.Scanner;

public class DrawDiamond {
    // Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Gimme number:");
        int myNumber = myScanner.nextInt();

        for (int i = 1; i < myNumber; i += 2) {
            for (int k = 0; k < myNumber - i / 2; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        if (myNumber % 2 == 0) {
            for (int x = myNumber - 1; x > 0; x -= 2) {
                for (int k = 0; k < myNumber - x / 2; k++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < x; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
        else for (int x = myNumber; x > 0; x -= 2) {
            for (int k = 0; k < myNumber - x / 2; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

