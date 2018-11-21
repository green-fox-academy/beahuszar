package music;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar() {
     super();
     setNumberOfStrings(6);
     name = "Electric Guitar";
  }

  public ElectricGuitar(int numberOfStrings) {
    super(numberOfStrings);
    name = "Electric Guitar";
  }

  @Override
  public void sound() {
    System.out.println("Twang");
  }
}
