package countLetters;

import java.util.HashMap;

public class CountLetters {
  public HashMap<Character, Integer > dictionary = new HashMap<>();

  public  HashMap<Character, Integer > createDictionary(String input) {
    char[] keys = input.toCharArray();
    for (int i = 0; i < keys.length; i++) {
      if (dictionary.containsKey(keys[i])) {
        dictionary.put(keys[i],dictionary.get(keys[i]) + 1);
      } else dictionary.put(keys[i],1);
    }
    System.out.println(dictionary.get('a'));
    return dictionary;
  }
}
