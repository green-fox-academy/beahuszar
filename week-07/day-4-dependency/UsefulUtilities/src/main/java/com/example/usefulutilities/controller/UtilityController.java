package com.example.usefulutilities.controller;

import com.example.usefulutilities.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UtilityController {

  UtilityService utilityService;

  @Autowired
  public UtilityController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @GetMapping("/useful")
  public String getUseful() {
    return "main";
  }

  @GetMapping("/useful/colored")
  public String getRandomColoredBackground(Model model) {
    model.addAttribute("randomcolor",utilityService.randomColor());
    return "randomcolor";
  }

  @GetMapping("/useful/email")
  public String validateEmail (@RequestParam("email") String email,  Model model) {
      model.addAttribute("validatedEmail",
          utilityService.emailValidator(email)
              ? email + " is a valid email address"
              : email + " is NOT a valid email address");

      model.addAttribute("highlighter",
          utilityService.emailValidator(email)
              ? "green"
              : "red");
    return "email";
  }

  @GetMapping("useful/ceasar")
  public String ceasarEncoder (@RequestParam("word") String word,
                               @RequestParam("number") int number,
                               @RequestParam("command") String command,
                               Model model) {
    if (command.equals("encode")) {
      model.addAttribute("inputWord",utilityService.caesar(word, number));
    } else {
      model.addAttribute("inputWord",utilityService.caesar(word, -number));
    }
    return "ceasar";
  }
}
