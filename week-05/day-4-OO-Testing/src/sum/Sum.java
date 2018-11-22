package sum;

import java.util.ArrayList;

public class Sum {

  public int sum(ArrayList<Integer> parameter) {
    int sum = 0;
    for (Integer element : parameter) {
      sum += element;
    }
    return sum;
  }
}
