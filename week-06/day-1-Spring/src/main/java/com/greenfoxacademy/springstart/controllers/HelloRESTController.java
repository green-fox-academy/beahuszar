package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloRESTController {
  private AtomicLong atomicLong = new AtomicLong();

  @GetMapping(value="/greeting")
  @ResponseBody
  public Greeting greeting(@RequestParam String name) {
    return new Greeting("Hello, " + name,atomicLong.getAndIncrement());
  }
}
