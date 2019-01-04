package com.greenfoxacademy.tamagotchi.repository;

import javax.persistence.*;

@Entity
@Table(name = "tricks")
public class Trick {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String trickName;

  public Trick() {
  }

  public Trick(String trickName) {
    this.trickName = trickName;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTrickName() {
    return trickName;
  }

  public void setTrickName(String trickName) {
    this.trickName = trickName;
  }
}
