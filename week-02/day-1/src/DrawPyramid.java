import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;
// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
// The pyramid should have as many lines as the number was

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Number:");
        int myNumber = myScanner.nextInt();


        for (int i = 1; i < myNumber * 2; i += 2) {
            for (int k = 0; k < myNumber - i / 2; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}





