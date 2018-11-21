package main.java.animals.animal;

import flyable.Flyable;

public class Bird extends Animal implements Flyable {

  public Bird (String name) {
    super(name);
  }

  @Override
  public String getName() {
    return super.getName();
  }


  @Override
  public void land() {

  }

  @Override
  public void fly() {

  }

  @Override
  public void takeOff() {

  }
}
