package arraysAndHashmaps;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<String, String>(); //create hashmap

        hm.put("Katie", "Android, Wordpress");
        hm.put("Magda", "Facebook");
        hm.put("Vanessa", "Tools");
        hm.put("Ania", "Java");
        hm.put("Ania", "JEE"); //Java has been replaced by this value

        for (String key: hm.keySet()) { //iteration
            System.out.println(key+" : " +hm.get(key));
        }
        System.out.println();

        for (Map.Entry<String, String> entry: hm.entrySet()) { //iteration through entries only
            System.out.println(entry.getKey());
        }
        System.out.println();

        if (hm.containsKey("Katie")) { //check if contains a spec Key
            System.out.println("HashMap contains Katie yayy");
        }
        System.out.println();

        if (hm.containsValue("Cooking")){ //check if contains a spec value
            System.out.println("HM contains Cooking");
        } else {
            System.out.println("HM does not contain Cooking");
        }
    }
}
