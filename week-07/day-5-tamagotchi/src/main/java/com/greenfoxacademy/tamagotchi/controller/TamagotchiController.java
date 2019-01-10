package com.greenfoxacademy.tamagotchi.controller;

import com.greenfoxacademy.tamagotchi.repository.Drink;
import com.greenfoxacademy.tamagotchi.repository.Food;
import com.greenfoxacademy.tamagotchi.repository.Pet;
import com.greenfoxacademy.tamagotchi.service.TamagotchiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TamagotchiController {

  TamagotchiService service;

  @Autowired
  public TamagotchiController(TamagotchiService service) {
    this.service = service;
  }

  @GetMapping("/")
  public String index(@RequestParam(value = "name", required = false) String name, Model model) {
    model.addAttribute("pet", service.findByName(name));
    return "index";
  }

  @GetMapping("/login")
  public String login() {
    return "login";
  }

  @PostMapping("/login")
  public String login(String nickname, Model model) {
    model.addAttribute("error", service.errorMessage());
    return service.checkName(nickname);
  }

  @PostMapping("/reg")
  public String savePet(String newName) {
    return service.savePetByName(newName);
  }

  @GetMapping("/nutrition")
  public String addNutr(@RequestParam(value = "name") String name, Model model) {
    model.addAttribute("petToFeed", service.findByName(name));
    model.addAttribute("foodList", service.getFoodList());
    model.addAttribute("drinkList", service.getDrinkList());
    model.addAttribute("newfood", new Food());
    model.addAttribute("newdrink", new Drink());
    return "menu";
  }

  @PostMapping("/nutrition")
  public String postNutr(Pet pet) {
    service.savePet(pet);
    return "redirect:/?name=" + pet.getName();
  }

  @PostMapping("/newfood/{petname}")
  public String addNewFood(Food food, @PathVariable String petname) {
    service.addFood(food);
    return "redirect:/nutrition?name=" + petname;
  }

  @PostMapping("/newdrink/{petname}")
  public String addNewFood(Drink drink, @PathVariable String petname) {
    service.addDrink(drink);
    return "redirect:/nutrition?name=" + petname;
  }
}
