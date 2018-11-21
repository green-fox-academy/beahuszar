package main.java.animals.animal;

public abstract class Animal {
  protected String name;
  protected String animalType;
  protected String animalGender;
  int age;

  public Animal (String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public String breed() {
    return "laying eggs";
  }
  public void feed() {
    System.out.println("omnom");
  }
}
