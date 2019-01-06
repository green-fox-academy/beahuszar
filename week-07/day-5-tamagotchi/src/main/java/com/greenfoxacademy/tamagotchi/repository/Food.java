package com.greenfoxacademy.tamagotchi.repository;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "foods")
public class Food {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String food;

  @OneToMany(mappedBy = "food")
  private List<Pet> petList;

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

  public List<Pet> getPetList() {
    return petList;
  }

  public void setPetList(List<Pet> petList) {
    this.petList = petList;
  }
}
