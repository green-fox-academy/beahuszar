public class String2 {
  // Given a string, compute recursively a new string where all the 'x' chars have been removed.

  public static void main(String[] args) {
    System.out.println(xRemove("genxogagxi"));
  }

  public static String xRemove (String string) {
    if (string.contains("x")) {
      return xRemove(string.replaceFirst("x",""));
    } return string;
  }
}
