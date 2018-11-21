package main.java.music;

public abstract class Instruments {
  protected String name;
  protected String sound;

  public Instruments() {
  }

  public abstract void play();

  public void setName(String name) {
    this.name = name;
  }

  public void setSound(String sound) {
    this.sound = sound;
  }
}


