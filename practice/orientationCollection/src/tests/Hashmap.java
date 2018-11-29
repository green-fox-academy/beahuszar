package tests;
//create folder in project root
//mark dir as test root
//alt+enter on class name, create test & add JUnit

import java.util.HashMap;

public class Hashmap {
  public HashMap<Character, Integer > dictionary = new HashMap<>();

  public  HashMap<Character, Integer > countLetters(String input) {
    char[] keys = input.toCharArray();
    for (char character : keys) {
      if (dictionary.containsKey(character)) {
        dictionary.put(character,dictionary.get(character) + 1);
      } else dictionary.put(character,1);
    }
    return dictionary;
  }
}
