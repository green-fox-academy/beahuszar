import java.util.Arrays;

// - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc
public class SwapElements {
    public static void main(String[] args) {
        String[] abc = {"first", "second", "third"};
        String[] newAbc = Arrays.copyOfRange(abc,0,abc.length);
        newAbc[0] = abc[2];
        newAbc[2] = abc[0];
        System.out.println(Arrays.toString(newAbc));

        /* Bali megoldása:

        String temp = abc[0];
        abc[0] = abc[2];
        abc[2] = temp;
        System.out.print(Arrays.toString(abc)); */

    }
}
