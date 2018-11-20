package theGarden;

/*
The Flower
    needs water if its current water amount is less then 5
    when watering it the flower can only absorb the 75% of the water
    eg. watering with 10 the flower's amount of water should only increase with 7.5
*/

public class Flower extends Plant {

  Flower(String color) {
    super(color);
  }

  public void setWaterLevel(double waterAmount) {
    this.waterLevel = this.waterLevel + (waterAmount * 0.75);
  }


  public void status() {
    if (this.getWaterLevel() < 5) {
      System.out.println("The " + this.getColor() + " Flower needs water");
    } else System.out.println("The " + this.getColor() + " Flower doesn't need water");
  }



}
