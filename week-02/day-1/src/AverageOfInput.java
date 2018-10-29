import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4

        Scanner input = new Scanner(System.in);
        System.out.println("Number 1:");
        int a = input.nextInt();
        System.out.println("Number 2:");
        int b = input.nextInt();
        System.out.println("Number 3:");
        int c = input.nextInt();
        System.out.println("Number 4:");
        int d = input.nextInt();
        System.out.println("Number 5:");
        int e  = input.nextInt();

        int sum = a+b+c+d+e;
        int avr = sum/5;

        System.out.println("Sum: " + sum + ", Average: " +avr);
    }
}
