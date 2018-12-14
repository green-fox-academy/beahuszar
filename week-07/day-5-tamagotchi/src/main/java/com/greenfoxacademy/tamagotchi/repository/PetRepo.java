package com.greenfoxacademy.tamagotchi.repository;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PetRepo {

  private ArrayList<Pet> petList;

  public PetRepo() {
    this.petList = new ArrayList<>();
  }

  public void addPet(String name) {
    petList.add(new Pet(name));
  }

  public ArrayList<Pet> getPetList() {
    return petList;
  }

 public boolean isDuplicate(String name) {
   System.out.println(petList.size());
   for (Pet pet : petList) {
     System.out.println("cica");
     if (pet.getName().equals(name)) {
       return true;
     }
   }
   return false;
 }
}
