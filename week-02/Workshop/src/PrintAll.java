import java.lang.reflect.Array;
import java.util.Arrays;

import static java.lang.System.*;

public class PrintAll {
    // - Create an array variable named `numbers`
//   with the following content: `[4, 5, 6, 7]`
// - Print all the elements of `numbers`

    public static void main(String[] args) {
        int[] numbers = {4, 5, 6, 7};
        printIt(numbers);
    }

    public static void printIt (int... input) {

        for (int i =0; i < input.length; i++) {
            System.out.println(input[i]);
        }

    }

}
