package com.greenfox.frontend.Repository;

public class WordAppend {

  private String appended;

  public WordAppend(String appended) {
    this.appended = appended + "a";
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
