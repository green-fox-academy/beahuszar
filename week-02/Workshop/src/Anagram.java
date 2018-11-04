import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Word1:");
        String w1 = myScanner.next();
        System.out.println("Word2:");
        String w2 = myScanner.next();
        isAnagram(w1,w2);
    }

    public static void isAnagram(String input1,String input2){
        boolean status = true;

        if (input1.length() != input2.length()) {
            status = false;
        }
        else {
            char[] input1Array = input1.toLowerCase().toCharArray();
            char[] input2Array = input2.toLowerCase().toCharArray();
            Arrays.sort(input1Array);
            Arrays.sort(input2Array);
            status = Arrays.equals(input1Array,input2Array);
        }

        if (status) {
            System.out.println("Anagrams, yayy");
        }
        else {
            System.out.println("Not Anagrams, boooo");
        }
    }
}
