package com.greenfox.frontend.controller;

import com.greenfox.frontend.Repository.Doubling;
import com.greenfox.frontend.Repository.ErrorMessage;
import com.greenfox.frontend.Repository.Greeting;
import com.greenfox.frontend.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class JSONController {

  private MyService service;

  @Autowired
  public JSONController(MyService service) {
    this.service = service;
  }

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(value = "input") Integer inputNumber) {
    return service.getDouble(inputNumber);
  }

  @GetMapping("/greeter")
  public Object greeter(@RequestParam(name = "name", required = false) String name,
                          @RequestParam(name = "title", required = false) String title) {
    return service.getGreeting(name, title);
  }

  @GetMapping("/appenda/{appendable}")
  public Object appendA(@PathVariable String appendable) {
    return service.addA(appendable);
  }

}
