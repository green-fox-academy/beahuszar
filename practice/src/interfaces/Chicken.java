package interfaces;

public class Chicken extends Bird {
  public Chicken(int age, String gender, int weightInLbs) {
    super(age, gender, weightInLbs);
  }

  //overriding the method defined in bird
  public void fly() {
    System.out.println("not able to fly....");
  }
}
