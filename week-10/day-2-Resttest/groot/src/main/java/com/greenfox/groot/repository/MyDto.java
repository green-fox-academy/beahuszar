package com.greenfox.groot.repository;


public class MyDto {

  public String received;
  public String translated;

  public MyDto(String received) {
    this.received = received;
    this.translated = "I am Groot!";
  }

  public MyDto() {
    this.translated = "I am Groot!";
  }
}
