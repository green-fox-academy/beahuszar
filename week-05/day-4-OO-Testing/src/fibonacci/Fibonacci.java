package fibonacci;

public class Fibonacci {

  public static int fibonacci (int input) {
    if (input == 0) {
      return 0;
    } else if (input == 1) {
      return 1;
    }
    return fibonacci((input - 1)) + fibonacci((input - 2));
  }
}
