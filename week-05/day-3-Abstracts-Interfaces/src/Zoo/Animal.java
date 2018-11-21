package Zoo;

public abstract class Animal {
  String name;
  String animalType;
  String animalGender;
  int age;

  public String getName() {
    return name;
  }

  public abstract void breed();
  public abstract void feed();
}
