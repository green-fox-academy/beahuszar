package theGarden;

/*
The Flower
    needs water if its current water amount is less then 5
    when watering it the flower can only absorb the 75% of the water
    eg. watering with 10 the flower's amount of water should only increase with 7.5
*/

public class Flower{

  private double waterLevel;
  private String color;

  Flower(String color) {
    this.waterLevel = 0;
    this.color = color;
  }

  public void setWaterLevel(double wateramount) {
    wateramount = waterLevel + (wateramount * 0.75);
  }

  public double getWaterLevel() {
    return this.waterLevel;
  }



}
