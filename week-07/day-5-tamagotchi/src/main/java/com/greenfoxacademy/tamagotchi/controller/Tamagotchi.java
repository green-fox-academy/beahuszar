package com.greenfoxacademy.tamagotchi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Tamagotchi {

  @GetMapping("/")
  public String index() {
    return "index";
  }

}
