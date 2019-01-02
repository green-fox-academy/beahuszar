package com.greenfox.redditapp.controller;

import com.greenfox.redditapp.repository.RedditItem;
import com.greenfox.redditapp.service.RedditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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

  @GetMapping("/submit")
  public String submitItem(Model model) {
    model.addAttribute("item", new RedditItem());
    return "submit";
  }

  @PostMapping("/submit")
  public String saveItem (RedditItem item){
    service.saveItem(item);
    return "redirect:/";
  }

  @PostMapping("/upvote/{id}")
  public String upVote(@PathVariable long id) {
    service.upVote(id);
    return "redirect:/";
  }

  @PostMapping("/downvote/{id}")
  public String downVote(@PathVariable long id) {
    service.downVote(id);
    return "redirect:/";
  }
}
