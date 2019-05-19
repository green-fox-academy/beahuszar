package misc;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.*;

class Misc {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Deque<Integer> deque = new ArrayDeque<>();
    int n = in.nextInt();
    int m = in.nextInt();

    for (int i = 0; i < n; i++) {
      int num = in.nextInt();
      deque.add(num);
    }


    int maxUnique = 0;
    Set<Integer> mySet = new HashSet<>();
    Iterator<Integer> iterator = deque.iterator();

    while (deque.size() >= m){
      int counter = 1;
      while (counter <= m){
        int number = iterator.next();
        mySet.add(number);
        counter++;
      }
      if (mySet.size() > maxUnique){
        maxUnique = mySet.size();
      }
      mySet.clear();
      deque.removeFirst();
    }
  }
}

