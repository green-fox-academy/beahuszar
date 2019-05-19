public class NumberAdder {
  // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

  public static void main(String[] args) {
    System.out.println(numberAdder(5));
  }

  public static int numberAdder (int n) {

    if (n == 1) {
      return 1;
    } else {
      int result = numberAdder(n - 1) + n;
      return result;
    }
  }
}
