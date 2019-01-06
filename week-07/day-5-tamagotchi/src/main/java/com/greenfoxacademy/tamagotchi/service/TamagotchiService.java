package com.greenfoxacademy.tamagotchi.service;

import com.greenfoxacademy.tamagotchi.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TamagotchiService {

  private PetRepo repository;
  private FoodRepo foodRepo;
  private DrinkRepo drinkRepo;

  @Autowired
  public TamagotchiService(PetRepo repository, FoodRepo foodRepo, DrinkRepo drinkRepo) {
    this.repository = repository;
    this.foodRepo = foodRepo;
    this.drinkRepo = drinkRepo;
  }

  public String checkName(String name) {
    if (name == null) {
      return "redirect:/login";
    } else if (!isNameAlreadyCreated(name)) {
      return "login";
    } else {
      return "redirect:/?name=" + name;
    }
  }

  public String savePetByName(String name) {
    if (name == null) {
      return "redirect:/login";
    } else if (isNameAlreadyCreated(name)) {
      return "login";
    } else {
      repository.save(new Pet(name));
      return "redirect:/?name=" + name;
    }
  }

  public boolean isNameAlreadyCreated(String name) {
    return repository.existsByName(name);
  }

  public String errorMessage() {
    return "You have provided a name that has not been used before, add it as a new one!";
  }

  public Pet findByName(String name) {
    return repository.findByName(name);
  }

  public void savePet(Pet pet) {
    repository.save(pet);
  }

  public List<Food> getFoodList() {
    List<Food> foodList = new ArrayList<>();
    foodRepo.findAll().forEach(foodList::add);
    return foodList;
  }

  public List<Drink> getDrinkList() {
    List<Drink> drinkList = new ArrayList<>();
    drinkRepo.findAll().forEach(drinkList::add);
    return drinkList;
  }
}
