package com.greenfoxacademy.tamagotchi.controller;

import com.greenfoxacademy.tamagotchi.repository.Pet;
import com.greenfoxacademy.tamagotchi.service.TamagotchiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TamagotchiController {

  TamagotchiService service;

  @Autowired
  public TamagotchiController(TamagotchiService service) {
    this.service = service;
  }

  @GetMapping("/mypet")
  public String index() {
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
    return service.savePet(newName);
  }
}
