package arraysAndHashmaps;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysBana {
  public static void main(String[] args) {
    int[] randomArray; //declare
    randomArray = new int[20]; //initialize
    randomArray[1] = 2; //add value


    int[] numberArray = new int[10];                //fill up with loop
    for (int i = 0; i < numberArray.length; i++) {
      numberArray[i] = i;
    }

    String[] stringArray = {"just","random","words"}; //declare + fill with items

    int k = 1;
    while (k <= 41) {
      System.out.print("-");
      k++;
    }
    System.out.println();

    for (int i = 0; i < numberArray.length ; i++) {
      System.out.print("| " + i + " ");
    }
    System.out.println("|");

    ////////////////////////////////////////
    // MultiArrays

    String[][] multiArray = new String[10][10];

    for (int i = 0; i < multiArray.length; i++) {
      for (int j = 0; j < multiArray[i].length; j++) {
        multiArray[i][j] = i + " " + j;
      }
    }

    k = 1;
    while (k <= 61) {
      System.out.print("-");
      k++;
    }
    System.out.println();

    for (int i = 0; i < multiArray.length; i++) {
      for (int j = 0; j < multiArray[i].length; j++) {
        System.out.print("| " + multiArray[i][j] + " ");
      }
      System.out.println("|");
    }

    k = 1;
    while (k <= 61) {
      System.out.print("-");
      k++;
    }
    System.out.println();

    /////////////////////////////////////////////
    // enhancedForLoop

    for (String[] rows : multiArray) {
      for (String column : rows) {  //here it is not an array item anymore, but a string
        System.out.print("| " + column + " ");
      }
      System.out.println("|");
    }

    ////////////////////
    // CopyArray
    int[] numberCopy = Arrays.copyOf(numberArray, 5); //until 5th elemenet of original array (index number 4)
    for (int row : numberCopy) {
      System.out.print(row);
    }
    System.out.println("\n");

    Arrays.copyOfRange(numberArray, 3, 6); ////from the 3rd until the 6tth element

    System.out.println(Arrays.toString(numberCopy));  ////print elements of Array

    ///////////
    /// other filling methofs

    int[] morenumbers = new  int[100];
    Arrays.fill(morenumbers, 2); // fill up all items with value number 2

    char[][] boardgame = new char[10][10]; // fill up multiarray
    for (char[] row : boardgame) {
      Arrays.fill(morenumbers, '*');
    }

    //////////////////////////
    int [] numtoSort = new int[10];
    for (int i = 0; i < 10; i++) {
      numtoSort[i] = (int)(Math.random() * 100); // fill up with random numbers
    }
    Arrays.sort(numtoSort); // sort a the numbers in the array
    System.out.println(Arrays.toString(numtoSort));

    int wwhereIs50 = Arrays.binarySearch(numtoSort, 50); // search a number in the array
    System.out.println(wwhereIs50);
    //////////////////////////////
  }
}
