package com.greenfoxacademy.tamagotchi.repository;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "foods")
public class Food {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String foodName;

  @OneToMany(mappedBy = "food")
  private List<Pet> petList;

  public Food() {
  }

  public Food(String food) {
    this.foodName = food;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getFoodName() {
    return foodName;
  }

  public void setFoodName(String foodName) {
    this.foodName = foodName;
  }

  public List<Pet> getPetList() {
    return petList;
  }

  public void setPetList(List<Pet> petList) {
    this.petList = petList;
  }
}
