package recursions;

public class Bana {
  public static void main(String[] args) {
    Bana recursiontool = new Bana();
    DavefeinbergTut factorial = new DavefeinbergTut();
    System.out.println(recursiontool.geTriangularNumR(4));
    System.out.println(factorial.fact(4));
  }

  public int geTriangularNumR(int number) {
    System.out.println("Method" + number);

    if (number == 1) {
      System.out.println("Returned 1");
      return 1;
    } else {
      int result = number + geTriangularNumR(number - 1);
      System.out.print("Returned " + result);
      System.out.println(" : " + number + " + get TN(" + number + " - 1)");
      return result;
    }
  }

}
