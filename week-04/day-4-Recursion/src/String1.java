
public class String1 {
  // Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.

  public static void main(String[] args) {
    System.out.println(xReplace("genxogagxi"));
  }

  public static String xReplace (String string) {
    if (string.contains("x")) {
      return xReplace(string.replaceFirst("x","y"));
    } return string;
  }
}
