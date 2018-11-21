package main.java.music;

import com.sun.org.apache.xpath.internal.operations.String;

public abstract class StringedInstrument extends Instruments{
  int numberOfStrings;

  public StringedInstrument() {
    super();
  }

  public StringedInstrument(int numberOfStrings) {
    super();
    this.numberOfStrings = numberOfStrings;
  }

  public abstract void sound();

  @Override
  public void play() {
    sound();
  }

  public int getNumberOfStrings() {
    return numberOfStrings;
  }

  public void setNumberOfStrings(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }
}
