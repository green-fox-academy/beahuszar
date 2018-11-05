// - Create an array variable named `animals`
//   with the following content: `["koal", "pand", "zebr"]`
// - Add all elements an `"a"` at the en

import java.util.Arrays;

public class AppendA {

    public static void main(String[] args) {
        String [] myArray = {"koal", "pand", "zebr"};
        System.out.println(Arrays.toString(newArray(myArray)));

    }

    public static String[] newArray(String[] input) {
        String [] newInput = Arrays.copyOfRange(input,0,input.length);
        for (int i = 0; i < input.length ; i++) {
            newInput[i] = input[i] + "a";
        }
        return newInput;
    }
}
