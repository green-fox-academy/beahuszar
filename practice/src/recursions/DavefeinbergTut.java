package recursions;

public class DavefeinbergTut {
  public static void main(String[] args) {
    System.out.println(fact(4));
  }
  public static int fact(int n) {
    System.out.println("Method " + n);
    if (n == 1) {
      System.out.println("Returned 1");
      return 1;
    } else {
      int result = fact(n - 1) * n;
      System.out.print("Returned " + result);
      System.out.println(" : " + n + " + getFACT(" + n + " - 1)");
      return result;
    }

  }
}
