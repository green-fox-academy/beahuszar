package com.example.dependencies;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("FancyWriter")
public class FanciWriter implements TextWriter {

  public String WriteText(String s) {
    return s + " fancy Text";
  }
}
