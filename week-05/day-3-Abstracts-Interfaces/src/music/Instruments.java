package music;

public abstract class Instruments {
  protected String name;

  public Instruments() {
  }

  public abstract void play();

  public void setName(String name) {
    this.name = name;
  }
}


