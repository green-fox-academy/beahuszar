package inheritance;

public class SuperClassBana_Animal {
  private String name = "Animal";
  public String favFood = "Food";

  protected final void changeName(String newname) { //this method cannot be changed by any subclasses due to "final"
    this.name = newname;
  }

  protected final String getName() {
    return this.name;
  }

  public void eatStuff() {
    System.out.println("Yum " + favFood);
  }

  public void walkAround() {
    System.out.println(this.name + " walks around");
  }

  public SuperClassBana_Animal() {

  }

  public SuperClassBana_Animal(String name, String favFood) {
    this.changeName(name);
    this.favFood = favFood;
  }
}
