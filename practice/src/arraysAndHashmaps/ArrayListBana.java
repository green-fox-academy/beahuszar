package arraysAndHashmaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListBana {
    public static void main(String[] args) {
        ArrayList arrayListOne = new ArrayList();
        ArrayList arrayListTwo = new ArrayList();
        ArrayList<String> names = new ArrayList<String>();
        names.add("John Smith"); //index value 0
        names.add("Mohamed Alami"); //index value 1
        names.add("Oliver Miller"); //index value 2

        names.add(2, "Jack Ryan"); //replacing index2 and changing the original to index3
        names.set(0, "John Adams"); //overwriting the value of original index§
        names.remove(3); //remove index3
        // names.removeRange(0,1); //should remove all items in the range but not working

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.println(names); // print out everything in the list

        for (String i : names) { //enhanced for loop
            System.out.println(i);
        }

        Iterator indivItems = names.iterator(); //iterator, same as enhanced for loop

        while (indivItems.hasNext()) { // .hasNext() checks whether it still has more values
            System.out.println(indivItems.next());
        }

        ArrayList nameCopy = new ArrayList();
        ArrayList nameBackup = new ArrayList();

        nameCopy.addAll(names); //copy all the values from names to nameCopy

        String paulYoung = "Paul young";
        names.add(paulYoung); //add the value of py variable to names list

        if (names.contains(paulYoung)) { // check if PY is in names list
            System.out.println("Paul is here");
        }

        if (names.containsAll(nameCopy)) { //does names contain everything that is in nameCopy
            System.out.println("Everything in nameCopy is in names list");
        }

        names.clear(); //delete all values within the list
        if (names.isEmpty()) {
            System.out.println("Arraylist is empty");
        }

        Object[] moreNames = new Object[4]; //to make an array from a List
        moreNames = nameCopy.toArray();

        System.out.println(Arrays.toString(moreNames));
    }

}
