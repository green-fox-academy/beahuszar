public class Bunny2 {
  // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication)

  public static void main(String[] args) {
    System.out.println(earcounter(2, 3, 5));
  }

  public static int earcounter(int oddEar, int evenEar, int line) {

    if (line == 0) {
      return 0;
    } else if (line % 2 == 0) {
      return earcounter(oddEar, evenEar, line - 1) + evenEar;
    }
    return earcounter(oddEar, evenEar, line - 1) + oddEar;
  }
}
