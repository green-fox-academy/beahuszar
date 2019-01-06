package com.greenfoxacademy.tamagotchi.repository;

import javax.persistence.*;

@Entity
@Table(name = "foods")
public class Food {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String food;

  public Food() {
  }

  public Food(String food) {
    this.food = food;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }
}
