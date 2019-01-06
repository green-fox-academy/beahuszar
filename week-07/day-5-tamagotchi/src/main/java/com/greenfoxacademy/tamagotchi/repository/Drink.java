package com.greenfoxacademy.tamagotchi.repository;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "drinks")
public class Drink {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String drink;

  @OneToMany(mappedBy = "drink")
  private List<Pet> petList;

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

  public List<Pet> getPetList() {
    return petList;
  }

  public void setPetList(List<Pet> petList) {
    this.petList = petList;
  }
}
