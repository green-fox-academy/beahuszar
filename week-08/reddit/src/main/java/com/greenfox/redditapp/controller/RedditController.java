package com.greenfox.redditapp.controller;

import com.greenfox.redditapp.service.RedditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class RedditController {

  private RedditService service;

  @Autowired
  public RedditController(RedditService service) {
    this.service = service;
  }
}
