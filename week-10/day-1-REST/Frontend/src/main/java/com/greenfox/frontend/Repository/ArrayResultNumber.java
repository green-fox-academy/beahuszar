package com.greenfox.frontend.Repository;

public class ArrayResultNumber {
  private int result;
  private int[] result2;

  public ArrayResultNumber() {
  }

  public ArrayResultNumber(int result) {
    this.result = result;
  }

  public ArrayResultNumber(int[] result) {
    this.result2 = result;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
