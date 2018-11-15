public class Refactorio {
  // Create a recursive function called `refactorio`
// that returns it's input's factorial

  public static void main(String[] args) {
    System.out.println(fact(4));
  }
  public static int fact(int n) {
    if (n == 1) {
      return 1;
    } else {
      int result = fact(n - 1) * n;
      return result;
    }

  }
}
