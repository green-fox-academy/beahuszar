package com.greenfoxacademy.springstart.controllers;

public class Greeting {
  private String content;
  private long id;

  public Greeting(String content, long id) {
    this.content = content;
    this.id = id;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }





}
