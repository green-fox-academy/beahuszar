package com.greenfox.frontend.Repository;

import org.springframework.stereotype.Service;

public class ErrorMessage {

  private String error;

  public ErrorMessage(String error) {
    this.error = error;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
