package com.greenfox.frontend.controller;

import com.greenfox.frontend.Repository.Doubling;
import com.greenfox.frontend.Repository.ErrorMessage;
import com.greenfox.frontend.service.DoublingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JSONController {

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(value = "input") Integer inputNumber) {
    if (inputNumber == null) {
      return new ErrorMessage();
    } else {
      return new Doubling(inputNumber);
    }
  }

}
