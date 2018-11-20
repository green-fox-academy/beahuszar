package interfaces.bana;

public abstract class Crashable {
  boolean carDrivable = true; // it will be a variable

  public void youCrashed() {
    this.carDrivable = false;
  }

  public abstract void setCarStrenght(int carStrenght);
  public abstract int getCarStrenght();
}
