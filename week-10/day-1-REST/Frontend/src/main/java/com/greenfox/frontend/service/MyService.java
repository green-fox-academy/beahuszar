package com.greenfox.frontend.service;

import com.greenfox.frontend.Repository.Doubling;
import com.greenfox.frontend.Repository.ErrorMessage;
import com.greenfox.frontend.Repository.Greeting;
import com.greenfox.frontend.Repository.WordAppend;
import org.springframework.stereotype.Service;

@Service
public class MyService {

  public Object getDouble(Integer input) {
    if (input == null) {
      return new ErrorMessage("provide input");
    } else {
      return new Doubling(input);
    }
  }

  public Object getGreeting(String name, String title) {
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

  public Object addA(String inputString) {
    return new WordAppend(inputString);
  }
}
