import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("Hello Tiptop");
        myArrayList.add("Hello Really");
        myArrayList.add("Hello Roboto");
        myArrayList.add(0,"Hello Seadog");
        System.out.println(myArrayList);

        myArrayList.remove(0);
        System.out.println(myArrayList);

        myArrayList.set(1,"Hello Pebble");
        System.out.println(myArrayList);

        ArrayList<String> sameList = new ArrayList<>();
        sameList.addAll(myArrayList);
        System.out.println(sameList);

        System.out.println(myArrayList.size());

        String wert = "al";
        wert += "ma";
        System.out.println(wert.equals("alma")); // ==-vel nem adná ki h true, ez egy okosabb ==

        String valami = "msadoifjaodspigjgjdfoigjfpodgij";
        String [] valamiXXX = valami.split("g");
        for (String valmi: valamiXXX) {
            System.out.println(valmi);
        }

        HashMap<Integer, String> daysOfTheWeek = new HashMap<>();
        daysOfTheWeek.put(1, "Monday");
        daysOfTheWeek.put(2, "Tuesday");
        daysOfTheWeek.put(3, "Wednesday");
        daysOfTheWeek.put(4, "Thursday");
        daysOfTheWeek.put(5, "Friday");
        daysOfTheWeek.put(6, "Saturday");
        daysOfTheWeek.put(7, "Sunday");

        System.out.println(daysOfTheWeek.get(4));

        HashMap<String, String> engHunDict = new HashMap<>();
        engHunDict.put("apple", "alma");
        engHunDict.put("dog", "kutya");
        engHunDict.put("one", "egy");
        engHunDict.put("house", "ház");
        engHunDict.put("coffee", "kave");

        System.out.println(engHunDict.get("coffee "));

        List<String> blabla = Arrays.asList("hello", "hi", "hola"); //from array to arraylist
        ArrayList<String> blablabla = new ArrayList<>(Arrays.asList("one", "two", "three"));
        System.out.println(myArrayList.size());


    }
}
