package com.greenfoxacademy.tamagotchi.service;

import com.greenfoxacademy.tamagotchi.repository.PetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

  private PetRepo petRepo;

  @Autowired
  public LoginService(PetRepo petRepo) {
    this.petRepo = petRepo;
  }

  public String checkName(String name) {
    if (name == null) {
      return "redirect:/login";
    } else if (petRepo.isDuplicate(name)) {
      return "redirect:/login";
    } else {
      petRepo.addPet(name);
      return "redirect:/";
    }
  }

  public PetRepo getPetRepo() {
    return petRepo;
  }
}
