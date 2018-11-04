// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj


import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] aj = {3, 4, 5, 6, 7};
        int number1 = aj[0];
        int number2 = aj[1];

        aj[0] = aj[4];
        aj[1] = aj[3];
        aj[3] = number2;
        aj[4] = number1;

        System.out.println(Arrays.toString(aj));
    }
}
