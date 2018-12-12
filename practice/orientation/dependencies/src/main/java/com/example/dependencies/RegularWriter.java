package com.example.dependencies;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("RegularWriter")
public class RegularWriter implements TextWriter {
  public String WriteText(String s) {
    return s.toUpperCase();
  }
}
