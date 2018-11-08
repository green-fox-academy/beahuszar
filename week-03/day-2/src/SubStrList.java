import java.util.ArrayList;

public class SubStrList {
    public static void main(String[] args) {
        //  Create a function that takes a string and a list of string as a parameter
        //  Returns the index of the string in the list where the first string is part of
        //  Only need to find the first occurence and return the index of that
        //  Returns `-1` if the string is not part any of the strings in the list

        //  Example
        String[] searchArr = new String[] {"this", "is", "what", "I'm", "searching"};
        System.out.println(subStrList("ching", searchArr));
        //  should print: `4`
        System.out.println(subStrList("not", searchArr));
        //  should print: `-1`
    }

    public static int subStrList(String input1, String[] input2) {

        int index = 0;

        for (int i = 0; i < input2.length; i++) {
            if (input2[i].contains(input1)) {
                index = i;
                break;
            } else index = -1;
        }
        return index;
    }
}