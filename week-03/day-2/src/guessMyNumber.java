import java.util.Scanner;

public class guessMyNumber {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Guess a number between 1-100. You have 5 lives to use.");
        int guess = myScanner.nextInt();
        int myNumber = 10; //(int)(Math.random() * 101);
        int rounds = 4;

        if (myNumber == guess) {
            System.out.println("Congratulations. You won!");
        }


        while (rounds > 0 && myNumber != guess) {
            if (myNumber > guess) {
                    System.out.println("Too low. You have " + rounds + " lives left.");
                    rounds = rounds -1;
                    int guess2 = myScanner.nextInt();
            } else if (myNumber < guess) {
                    System.out.println("Too high. You have " + rounds + " lives left.");
                    rounds = rounds -1;
                    int guess3 = myScanner.nextInt();
            }
        } System.out.println("Aaaawwww, you lost. Try again!");








    }
}
