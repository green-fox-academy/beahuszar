import javafx.scene.transform.Scale;

import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        // Create a program that asks for two numbers
        // If the second number is not bigger than the first one it should print:
        // "The second number should be bigger"
        //
        // If it is bigger it should count from the first number to the second by one
        //
        // example:
        //
        // first number: 3, second number: 6, should print:
        //
        // 3
        // 4
        // 5

        Scanner input = new Scanner(System.in);
        System.out.println("Number1");
        int a = input.nextInt();
        System.out.println("Number2");
        int b = input.nextInt();

        if (b <= a) {
            System.out.println("The second number should be bigger");
        }
        else for (a = a; a < b; a++) {
            System.out.println(a);
        }
    }
}
