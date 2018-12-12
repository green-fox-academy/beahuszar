package com.example.dependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

  @Autowired
  @Qualifier("RegularWriter")
  TextWriter regular;

  @Autowired
  @Qualifier("FancyWriter")
  TextWriter fancy;

  @RequestMapping("/")
  public String index() {
    return fancy.WriteText("hi Bea");
  }
}
