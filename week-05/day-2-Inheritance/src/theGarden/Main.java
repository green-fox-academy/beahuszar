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

    List<Garden> myGarden = new ArrayList<>();
    myGarden.add(yellow);
    myGarden.add(blue);
    myGarden.add(purple);
    myGarden.add(orange);

    watering.watering(myGarden,40); // is that possible to call the function different way?
    watering.watering(myGarden,70);



  }
}
