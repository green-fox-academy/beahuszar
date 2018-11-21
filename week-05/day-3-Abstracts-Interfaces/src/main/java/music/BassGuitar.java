package main.java.music;

public class BassGuitar extends StringedInstrument {
  public BassGuitar() {
    super();
    setNumberOfStrings(4);
    name = "Bass Guitar";
    sound = "Duum-duum-duum";
  }

  public BassGuitar(int numberOfStrings) {
    super(numberOfStrings);
    name = "Bass Guitar";
    sound = "Duum-duum-duum";
  }

  @Override
  public void sound() {
    System.out.println(this.name + ", a " + getNumberOfStrings() + "-stringed instrument that goes " + sound);
  }
}
