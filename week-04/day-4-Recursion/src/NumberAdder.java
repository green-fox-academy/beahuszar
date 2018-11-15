public class NumberAdder {
  // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

  public static void main(String[] args) {
    numberAdder(7);
  }

  public static void numberAdder (int n) {

    if (n == 0) {
      return;
    }
    numberAdder(n - 1);
    System.out.println(n);

  }
}
