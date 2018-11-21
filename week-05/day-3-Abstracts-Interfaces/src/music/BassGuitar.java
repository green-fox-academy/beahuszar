package music;

public class BassGuitar extends StringedInstrument {
  public BassGuitar() {
    super();
    setNumberOfStrings(4);
    name = "Bass Guitar";
  }

  public BassGuitar(int numberOfStrings) {
    super(numberOfStrings);
    name = "Bass Guitar";
  }

  @Override
  public void sound() {
    System.out.println("Duum-duum-duum");
  }
}
