import java.util.Scanner;

public class guessMyNumber {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Guess a number between 1-100. You have 5 lives to use.");
        int guess = myScanner.nextInt();
        int myNumber = 10; // (int)(Math.random() * 101);
        int rounds = 4;

        while (rounds > 0) {
            if (myNumber > guess) {
                    System.out.println("Too low. You have " + rounds + " lives left. Try again:");
                    rounds = rounds -1;
                    guess = myScanner.nextInt();
            } else if (myNumber < guess) {
                    System.out.println("Too high. You have " + rounds + " lives left. Try again:");
                    rounds = rounds -1;
                    guess = myScanner.nextInt();
            } else if (myNumber == guess) {
                System.out.println("Congratulations. You won!");
                break;
            }
        }

        if (rounds == 0) {
            System.out.println("Aaaawwww, you lost. The correct number was: " + myNumber +" Try again!");
        }

    }
}
