import org.omg.PortableInterceptor.INACTIVE;

import java.util.Arrays;

public class DoubleItems {
    // - Create an array variable named `numList`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Double all the values in the array

    public static void main(String[] args) {
        int[] numList = {3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(newValue(numList)));


        /* int[] newNumlist = Arrays.copyOfRange(numList, 0, numList.length);
        for (int i = 0; i < numList.length; i++) {
            newNumlist[i] = numList[i] * 2;
        }
        System.out.print(Arrays.toString(newNumlist)); */
    }

   public static int[] newValue(int[] input) {
        int[] newInput = Arrays.copyOfRange(input,0, input.length);

        for (int i = 0; i < input.length; i++) {
            newInput[i] = input[i] * 2;
        }
        return newInput;
    }
}
