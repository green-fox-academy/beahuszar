package com.greenfoxacademy.tamagotchi.service;

import com.greenfoxacademy.tamagotchi.repository.Pet;
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
    String endPoint = "";
    System.out.println("variable " + name);
    if (petRepo.getPetList().size() > 0) {
      for (Pet pet : petRepo.getPetList()) {
        if (pet.getName().equals(name)) {
          System.out.println("if");
          endPoint = "redirect:/login";
        } else if (name == null) {
          System.out.println("else if");
          endPoint = "redirect:/login";
        } else {
          System.out.println("else");
          petRepo.addPet(name);
          endPoint = "redirect:/";
        }
      }
    } else {
      System.out.println("üres lista először adja hozzá");
      petRepo.addPet(name);
      endPoint = "redirect:/";
    }
    System.out.println("endpoint " + endPoint);
    return endPoint;
  }

  public PetRepo getPetRepo() {
    return petRepo;
  }
}
