package com.greenfoxacademy.tamagotchi.controller;

import com.greenfoxacademy.tamagotchi.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TamagotchiController {

  LoginService loginService;

  @Autowired
  public TamagotchiController(LoginService loginService) {
    this.loginService = loginService;
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
    String temp = loginService.checkName(nickname);
    return temp;
  }
}
