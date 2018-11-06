import java.util.*;

public class Matchmaking{
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }
    public static ArrayList makingMatches (ArrayList input1, ArrayList input2) {
        ArrayList girls = input1;
        ArrayList boys = input2;
        ArrayList kombo = new ArrayList();

        if (girls.size() < boys.size()) {
            for (int i = 0; i < girls.size()  ; i++) {
                kombo.add(girls.get(i));
                kombo.add(boys.get(i));
            }
            for (int k = boys.size(); k > girls.size() ; k--) {
                kombo.add(boys.get(k-1));
            }

        }
        else if (girls.size() > boys.size()) {
            for (int i = 0; i < boys.size()  ; i++) {
                kombo.add(girls.get(i));
                kombo.add(boys.get(i));
            }
            for (int k = girls.size(); k > boys.size() ; k--) {
                kombo.add(girls.get(k-1));
            }
        }
        else if (girls.size() == boys.size()) {
            for (int i = 0; i < girls.size()  ; i++) {
                kombo.add(girls.get(i));
                kombo.add(boys.get(i));
            }
        }
        return kombo;

    }
}