import java.util.*;

public class AppendLetter{
    public static void main(String... args){
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.

        System.out.println(appendA(far));
    }

    public static List appendA (List input) {
        List amended = input;
        ArrayList newFar = new ArrayList();

        for (int i = 0; i < input.size() ; i++) {
            newFar.add(amended.get(i)+"a");
        }

        return newFar;
    }
}

// The output should be: "boa", "anaconda", "koala", "panda", "zebra"