package anagram;

import java.util.Arrays;

public class Anagram {
  public boolean isAnagram(String a, String b) {
    boolean status;

    if(a.length() != a.length()) {
      status = false;
    } else {
      char[] aArray = b.toLowerCase().toCharArray();
      char[] bArray = b.toLowerCase().toCharArray();
      Arrays.sort(aArray);
      Arrays.sort(bArray);
      status = Arrays.equals(aArray, bArray);
    }

    return status;
  }
}
