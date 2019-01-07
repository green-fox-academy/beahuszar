package com.greenfox.frontend.Repository;

public class ErrorMessage {

  private String error;

  public ErrorMessage() {
    this.error = "Please provide an input!";
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
