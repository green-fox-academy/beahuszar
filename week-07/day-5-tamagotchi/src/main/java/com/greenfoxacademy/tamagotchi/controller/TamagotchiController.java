package com.greenfoxacademy.tamagotchi.controller;

import com.greenfoxacademy.tamagotchi.service.TamagotchiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TamagotchiController {

  TamagotchiService service;

  @Autowired
  public TamagotchiController(TamagotchiService service) {
    this.service = service;
  }

  @GetMapping("/")
  public String index() {
    return "index";
  }

  @GetMapping("/login")
  public String login() {
    return "login";
  }

  @PostMapping("/login")
  public String login(String nickname) {
    return service.checkName(nickname);
}
}
