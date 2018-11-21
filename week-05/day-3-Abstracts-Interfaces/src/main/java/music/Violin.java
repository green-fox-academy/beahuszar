package main.java.music;

public class Violin extends StringedInstrument {
  public Violin() {
    super();
    setNumberOfStrings(4);
    name = "Violin";
    sound = "Screech";
  }

  public Violin(int numberOfStrings) {
    super(numberOfStrings);
    name = "Violin";
    sound = "Screech";
  }

  @Override
  public void sound() {
    System.out.println(this.name + ", a " + getNumberOfStrings() + "-stringed instrument that goes " + sound);
  }
}
