package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
  AtomicLong atomicLong = new AtomicLong();

  @RequestMapping("/web/greeting")
  public String greeting(@RequestParam String name, Model model) {
    long counter = atomicLong.incrementAndGet();
    model.addAttribute("name", name);
    model.addAttribute("counter", counter);
    return "greeting";
  }

}
