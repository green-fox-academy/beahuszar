package com.greenfox.frontend.service;

import com.greenfox.frontend.Repository.*;
import org.springframework.stereotype.Service;

@Service
public class MyService {

  public Object getDouble(Integer input) {
    if (input == null) {
      return new ErrorMessage("provide input");
    } else {
      return new ResultNumber(input);
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

  public DoUntilNumber doUntil(String action, int until) {
    if (action.equals("sum")) {
      return sumUntil(until);
    } else {
      return factorUntil(until);
    }
  }

  public DoUntilNumber sumUntil(int input) {
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

  public Object getResultFromJsonObject(String mathOperation, int[] numberArray) {
    if (mathOperation == null || numberArray.length == 0) {
      return new ErrorMessage("Please provide math operation or numbers");
    } else {
      if (mathOperation.equals("sum")) {
        return getArraySum(numberArray);
      } else if (mathOperation.equals("multiply")) {
        return getArrayMultiple(numberArray);
      } else {
        return doubleNumbersInArray(numberArray);
      }
    }
  }

  private ArrayResultNumber doubleNumbersInArray(int[] numberArray) {
    for (int i = 0; i < numberArray.length; i++) {
      numberArray[i] = numberArray[i] * 2;
    }
    return new ArrayResultNumber(numberArray);
  }

  private ArrayResultNumber getArrayMultiple(int[] numberArray) {
    int result = 1;

    for (int i = 0; i < numberArray.length; i++) {
      result = result * numberArray[i];
    }

    return new ArrayResultNumber(result);
  }

  private ArrayResultNumber getArraySum(int[] numberArray) {
    int result = 0;

    for (int i = 0; i < numberArray.length; i++) {
      result = result + numberArray[i];
    }

    return new ArrayResultNumber(result);
  }
}
