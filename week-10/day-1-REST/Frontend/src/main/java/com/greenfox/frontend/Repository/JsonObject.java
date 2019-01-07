package com.greenfox.frontend.Repository;

public class JsonObject {

  private int until;
  private String mathOperation;
  private int[] numberArray;

  public JsonObject() {
  }

  public JsonObject(int until) {
    this.until = until;
  }

  public JsonObject(String mathOperation, int[] numberArray) {
    this.mathOperation = mathOperation;
    this.numberArray = numberArray;
  }

  public String getMathOperation() {
    return mathOperation;
  }

  public void setMathOperation(String mathOperation) {
    this.mathOperation = mathOperation;
  }

  public int[] getNumberArray() {
    return numberArray;
  }

  public void setNumberArray(int[] numberArray) {
    this.numberArray = numberArray;
  }

  public int getUntil() {
    return until;
  }

  public void setUntil(int until) {
    this.until = until;
  }
}
