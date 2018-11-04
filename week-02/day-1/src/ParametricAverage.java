import java.util.Scanner;

public class ParametricAverage {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("number:");
        int myNumber = myScanner.nextInt();
        int sum = 0;

        for (int i = 0; i < myNumber; i++) {
            System.out.println("Number for list:");
            int nextnumber = myScanner.nextInt();
            sum += nextnumber;
        }
        System.out.println("sum is: " + sum);
        System.out.println("average is: " + sum/myNumber);
    }
}
