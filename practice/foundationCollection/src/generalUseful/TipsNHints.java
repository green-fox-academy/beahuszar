package generalUseful;

import java.util.*;

public class TipsNHints {

  private int qty;
  private String name;

  public TipsNHints(){
    this.qty = 123;
    this.name = "exampleString";
  }

  public void hashSetForUnique () {
    List<String> hasDuplicates = new ArrayList<>();
    Set<String> toRemoveDuplicates = new HashSet<>();

    toRemoveDuplicates.addAll(hasDuplicates);
    hasDuplicates.clear();
    hasDuplicates.addAll(toRemoveDuplicates);
  }

  public String toString() { //toString override method
    return this.qty + " pieces of " + this.name;
  }

  public void getSimpleNameUsage() {
    // https://www.tutorialspoint.com/java/lang/class_getsimplename.htm
    TipsNHints tipsNHints = new TipsNHints();
    Class vmi = tipsNHints.getClass();

    vmi.getSimpleName();
  }

  public void arrays_lists_Useful() {
    ArrayList<String> example = new ArrayList<>();
    example.add(0,"xxx");
    example.add(1,"yyy");
    example.add(2,"vmi"); //replacing index2 and changing the original to index3
    example.set(2,"vmi2"); //overwriting the value of original index§

    Iterator iterator = example.iterator(); //iterator, hasnext
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    // x.containsAll(y) --> does list_x contain everything that is in list_y
    // arrayName = listName.toArray() --> to make an array from a List
    // System.out.println(Arrays.toString(arrayName))

    int[] original = new int[12];
    int[] copy = Arrays.copyOf(original, 5); //until 5th elemenet of original array (index number 4)
    Arrays.fill(original,2); // fill up all items with value number 2
    Arrays.sort(copy); // sort the numbers in the array
    Arrays.binarySearch(copy,20); // search a number in the array
  }

  public void hashmapTips() {
    HashMap<String,String> hm = new HashMap<>();

    hm.put("Vanessa", "Tools");
    hm.put("Ania", "Java");
    hm.put("Ania", "JEE"); //Java has been replaced by this value

    for (String key: hm.keySet()) { //iteration through key
      System.out.println(key+" : " +hm.get(key));
    }

    for (Map.Entry<String, String> entry: hm.entrySet()) { //iteration through entries
      System.out.println(entry.getKey());
    }

    hm.containsValue("vmi");
    hm.containsKey("vmi");
  }

}
