public class String3 {
  // Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".

  public static void main(String[] args) {

    String input = "jfodfijlisdj";
    System.out.println(adjacentR(input, input.length()));
  }

  public static String adjacentR(String input, int length) {
    if (length > 1) {
      input =  input.substring(0,length - 1) + "*" + input.substring(length - 1);
      return adjacentR(input,length - 1);
    } return input;
  }
}
