package com.greenfoxacademy.tamagotchi.service;

import com.greenfoxacademy.tamagotchi.repository.DrinkRepo;
import com.greenfoxacademy.tamagotchi.repository.FoodRepo;
import com.greenfoxacademy.tamagotchi.repository.Pet;
import com.greenfoxacademy.tamagotchi.repository.PetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

  public String savePet(String name) {
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
}
