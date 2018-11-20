package theGarden;

/*
The Garden
    is able to hold unlimited amount of flowers or trees
    when watering it should only water those what needs water with equally divided amount amongst them
    eg. watering with 40 and 4 of them need water then each gets watered with 10
*/

import java.util.ArrayList;
import java.util.List;

public class Garden {
  private List<Garden> myGarden;
  private boolean needswater = true;

  public void watering(List<Garden> myGarden, double wateramount) {

    List<Garden> whoNeedsWater = new ArrayList<>();

    for (Garden plant : myGarden) {
      if (needswater) {
        whoNeedsWater.add(plant);
      }
    }

    wateramount = wateramount / whoNeedsWater.size();

    for (Garden plant : whoNeedsWater) {
      if (plant instanceof Flower) {
        ((Flower)plant).setWaterLevel(wateramount);
      } else {
        ((Tree)plant).setWaterLevel(wateramount);
      }
    }
  }
}

