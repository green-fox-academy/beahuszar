package theGarden;

/*
needs water if its current water amount is less then 10
    when watering it the tree can only absorb the 40% of the water
    eg. watering with 10 the tree's amount of water should only increase with 4
*/

public class Tree extends Plant {

  Tree(String color) {
    super(color);
  }

  public void setWaterLevel(double wateramount) {
    this.waterLevel = this.waterLevel + (wateramount * 0.4);
  }

  public void status() {
    if (this.getWaterLevel() < 10) {
      System.out.println("The " + this.getColor() + " Tree needs water");
    } else System.out.println("The " + this.getColor() + " Tree doesn't need water");
  }


}
