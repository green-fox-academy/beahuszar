import java.util.Scanner;

public class ArmsgtrongNumber {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Gimme a number: ");
        int check = myScanner.nextInt();
        int myNumber = check;
        int lenght = (int) (Math.log10(check) + 1);
        int count = 0;
        int result = 0;

        while(check > 0) {
            int digit = check % 10;
            if(digit == 1)
                count ++;
            check /= 10;
            result += Math.pow(digit, lenght);
        }

        if (result == myNumber) {
            System.out.println("Yayy!! " + myNumber + " is an Armstrong number.");
        } else System.out.println("No luck.");
    }
}
