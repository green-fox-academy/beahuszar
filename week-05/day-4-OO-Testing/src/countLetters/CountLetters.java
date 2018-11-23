package countLetters;

import java.util.HashMap;

public class CountLetters {
  public HashMap<Character, Integer > dictionary = new HashMap<>();

  public  HashMap<Character, Integer > createDictionary(String input) {
    char[] keys = input.toCharArray();
    for (char character : keys) {
      if (dictionary.containsKey(character)) {
        dictionary.put(character,dictionary.get(character) + 1);
      } else dictionary.put(character,1);
    }
    return dictionary;
  }
}



