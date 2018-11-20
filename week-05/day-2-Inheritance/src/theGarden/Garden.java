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

  public void watering(List<Plant> myGarden, double wateramount) {

    List<Plant> whoNeedsWater = new ArrayList<>();

    for (Plant plant : myGarden) {
      if (((plant instanceof  Flower) && (plant.getWaterLevel() < 5))
        ||(plant instanceof  Tree) && (plant.getWaterLevel() < 10)) {
        whoNeedsWater.add(plant);
      }
    }

    wateramount = wateramount / whoNeedsWater.size();

    for (Plant plant : whoNeedsWater) {
      if (plant instanceof Flower) {
        ((Flower)plant).setWaterLevel(wateramount);
      } else {
        ((Tree)plant).setWaterLevel(wateramount);
      }
    }
  }
}

