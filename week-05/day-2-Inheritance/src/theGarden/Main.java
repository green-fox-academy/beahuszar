package theGarden;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Flower yellow = new Flower("yellow");
    Flower blue = new Flower("blue");
    Tree purple = new Tree("purple");
    Tree orange = new Tree("orange");
    Garden watering = new Garden();

    List<Plant> myGarden = new ArrayList<>();
    myGarden.add(yellow);
    myGarden.add(blue);
    myGarden.add(purple);
    myGarden.add(orange);

    watering.watering(myGarden,40); // is that possible to call the function different way?
    for (Plant plant : myGarden) {
      if (plant instanceof Flower) {
        ((Flower) plant).status();
      } else ((Tree)plant).status();
    }
    System.out.println();

    watering.watering(myGarden,70);
    for (Plant plant : myGarden) {
      if (plant instanceof Flower) {
        ((Flower)plant).status();
      } else ((Tree)plant).status();
    }
    System.out.println();


  }
}
