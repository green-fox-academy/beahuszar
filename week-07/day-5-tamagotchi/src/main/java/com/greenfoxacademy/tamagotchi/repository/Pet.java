package com.greenfoxacademy.tamagotchi.repository;

import javax.persistence.*;

@Entity
@Table(name = "pets")
public class Pet {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String name;

  public Pet() {
  }

  public Pet(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }
}
