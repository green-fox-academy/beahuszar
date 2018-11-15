public class Bunny1 {
  // We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

  public static void main(String[] args) {
    System.out.println(bunnyEarCounter(8,2));
  }

  public static int bunnyEarCounter(int bunnies, int ear) {

    if (bunnies == 0) {
      return 0;
    }
    return bunnyEarCounter(bunnies - 1, ear) + ear ;
  }
}

