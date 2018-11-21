package main.java.music;

public class Violin extends StringedInstrument {
  public Violin() {
    super();
    setNumberOfStrings(4);
    name = "Violin";
  }

  public Violin(int numberOfStrings) {
    super(numberOfStrings);
    name = "Violin";
  }

  @Override
  public void sound() {
    System.out.println("Screech");
  }
}
