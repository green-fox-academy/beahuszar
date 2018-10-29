import java.util.Scanner;

public class printbigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one

        Scanner input   = new Scanner(System.in);
        System.out.println("Number1:");
        int a = input.nextInt();
        System.out.println("Number2:");
        int b = input.nextInt();

        if (a > b) {
            System.out.println(a);
        }
        else System.out.println(b);



    }
}
