package com.greenfox.frontend.service;

import com.greenfox.frontend.Repository.*;
import com.greenfox.frontend.controller.JSONController;
import org.springframework.stereotype.Service;

import java.util.HashMap;

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

  public WordAppend addA(String inputString) {
    return new WordAppend(inputString);
  }

  public DoUntilNumber doUntil(String action, HashMap<String, Integer> jsonMap) {
    if (action.equals("sum")) {
      return sumUntil(jsonMap.get("until"));
    } else {
      return factorUntil(jsonMap.get("until"));
    }
  }

  public DoUntilNumber sumUntil(Integer input) {
    int myNumber = 0;
    for (int i = 1; i <= input ; i++) {
      myNumber = myNumber + i;
    }
    return new DoUntilNumber(myNumber);
  }

  public DoUntilNumber factorUntil(Integer input) {
    int fact = 1;

    for(int i = 1;i <= input; i++){
      fact = fact * i;
    }
    return new DoUntilNumber(fact);
  }
}
