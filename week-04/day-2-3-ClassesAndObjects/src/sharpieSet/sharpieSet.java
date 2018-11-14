package sharpieSet;
import sharpie.Sharpie;
import sharpie.Main;

import java.util.List;

/*Reuse your Sharpie class
Create SharpieSet class
it contains a list of Sharpie
countUsable() -> sharpie is usable if it has ink in it
removeTrash() -> removes all unusable sharpies*/

public class sharpieSet {
  int countUsable;

  public int countUsable(List<Sharpie> inputlist) {
    for (Sharpie sharpies : inputlist) {
      if (sharpies.inkAmount != 0) {
        countUsable++;
      }
    }
    return countUsable;
  }

  public void removeTrash(List<Sharpie> inputList) {
    for (Sharpie sharpies : inputList) {
      if (sharpies.inkAmount == 0) {
        inputList.remove(sharpies);
      }
    }
  }
}
