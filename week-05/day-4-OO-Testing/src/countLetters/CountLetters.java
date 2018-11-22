package countLetters;

import java.util.HashMap;

public class CountLetters {
  public HashMap<Character,Integer > dictionary;

  public  HashMap<Character,Integer > createDictionary(String input) {
    char[] keys = input.toCharArray();

    for (int i = 0; i < keys.length; i++) {
      if (dictionary.containsKey(keys[i])) {
        dictionary.put(keys[i],dictionary.get(keys[i])+1);
      } dictionary.put(keys[0],1);
    }
    return dictionary;
  }
}
