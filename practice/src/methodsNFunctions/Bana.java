package methodsNFunctions;
import java.util.Scanner;

public class Bana {
  static double myPI = 3.14159; //class variable
  static int randomNumber;
  static Scanner myScanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println(addThem(1,2));
    int d = 5;
    tryToChange(d);
    System.out.println(getRandomNum());
    int guessResult = 1;
    int randomGuess = 0;

    while (guessResult != -1) {
      System.out.println("Guess a numbert btw 0 and 50");
      randomGuess = myScanner.nextInt();
      guessResult = checkGuess(randomGuess);
    }
    System.out.println("Yes the random number is " + randomGuess);

  }

  public static int getRandomNum() {
    randomNumber = (int)(Math.random() * 51);
    return randomNumber;
  }

  public static int checkGuess(int guess) {
    if (guess == randomNumber) {
      return -1;
    } else return guess;
  }

  public static int addThem(int a, int b) {
    double smallPI = 3.140; //Local Variable
    double myPI = 3.0; //overwrites global
    System.out.println("Global " + myPI);

    int c = a + b; //using the parameters
    return c;
  }

  public static void tryToChange(int d) {
    d = d + 1;
    System.out.println("tryToChange d = " + d);
  }
}
