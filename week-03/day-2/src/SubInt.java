import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubInt {
    public static void main(String[] args) {
        //  Create a function that takes a number and a list of numbers as a parameter
        //  Returns the indexes of the numbers in the list where the first number is part of
        //  Returns an empty list if the number is not part any of the numbers in the list

        //  Example:
        System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
        //  should print: `[0, 1, 4]`
        System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
        //  should print: '[]'
    }

    public static ArrayList subInt (int input1, int[] input2) {
        ArrayList<Integer> newList = new ArrayList<>();
        ArrayList<Integer> finalList = new ArrayList<>();


        for (int element : input2) {
            newList.add(element);
        }


        for (int i = 0; i < newList.size(); i++) {
            if (newList.get(i).toString().contains(Integer.toString(input1))) {
                finalList.add(newList.indexOf(newList.get(i)));
            }
        }

        return finalList;
    }

}