package com.greenfoxacademy.tamagotchi.service;

import com.greenfoxacademy.tamagotchi.repository.Pet;
import com.greenfoxacademy.tamagotchi.repository.PetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TamagotchiService {

  private PetRepo repository;

  @Autowired
  public TamagotchiService(PetRepo repository) {
    this.repository = repository;
  }

  public String checkName(String name) {
    if (name == null) {
      return "redirect:/login";
    } else if (isDuplicateName(name)) {
      return "redirect:/login";
    } else {
      savePet(name);
      return "redirect:/";
    }
  }

  public void savePet(String name) {
    repository.save(new Pet(name));
  }

  public boolean isDuplicateName(String name) {
    return repository.existsByName(name);
  }
}
