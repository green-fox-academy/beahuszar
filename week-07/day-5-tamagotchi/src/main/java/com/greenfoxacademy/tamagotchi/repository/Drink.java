package com.greenfoxacademy.tamagotchi.repository;

import javax.persistence.*;

@Entity
@Table(name = "drinks")
public class Drink {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String drink;

  public Drink() {
  }

  public Drink(String drink) {
    this.drink = drink;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }
}
