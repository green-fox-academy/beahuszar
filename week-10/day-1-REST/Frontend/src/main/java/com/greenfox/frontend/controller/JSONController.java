package com.greenfox.frontend.controller;

import com.greenfox.frontend.Repository.Doubling;
import com.greenfox.frontend.Repository.ErrorMessage;
import com.greenfox.frontend.Repository.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JSONController {

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(value = "input") Integer inputNumber) {
    if (inputNumber == null) {
      return new ErrorMessage("provide input");
    } else {
      return new Doubling(inputNumber);
    }
  }

  @GetMapping("/greeter")
  public Object greeter(@RequestParam(name = "name", required = false) String name,
                          @RequestParam(name = "title", required = false) String title) {
    if (name.isEmpty() && title.isEmpty()) {
      return new ErrorMessage("Please provide name and title");
    } else if (name.isEmpty()) {
      return new ErrorMessage("please provide name");
    } else if (title.isEmpty()) {
      return new ErrorMessage("please provide title");
    } else {
      return new Greeting(name,title);
    }
  }

}
