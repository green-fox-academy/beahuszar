import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.

        Scanner input = new Scanner(System.in);
        System.out.println("Please provide a number");
        int myNumber = input.nextInt();
        if (myNumber%2==0) {
            System.out.println("The number is even");
        }
        else System.out.println("The number is odd");
    }
}
