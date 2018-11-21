package main.java.music;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar() {
     super();
     setNumberOfStrings(6);
     name = "Electric Guitar";
     sound = "Twang";
  }

  public ElectricGuitar(int numberOfStrings) {
    super(numberOfStrings);
    name = "Electric Guitar";
    sound = "Twang";
  }

  @Override
  public void sound() {
    System.out.println(this.name + ", a " + getNumberOfStrings() + "-stringed instrument that goes " + sound);
  }
}
