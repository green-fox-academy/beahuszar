package com.bea.webshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyWebshop {

  public MyWebshop() {

  }
  @RequestMapping(value="/webshop")
  public String greeting() {
    return "webshop";
  }
}
