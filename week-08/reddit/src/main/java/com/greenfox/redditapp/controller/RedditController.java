package com.greenfox.redditapp.controller;

import com.greenfox.redditapp.service.RedditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedditController {

  private RedditService service;

  @Autowired
  public RedditController(RedditService service) {
    this.service = service;
  }

  @GetMapping("/")
  public String mainPage(Model model) {
    model.addAttribute("list", service.getAllItems());
    return "index";
  }
}
