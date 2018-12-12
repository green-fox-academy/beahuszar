package com.example.dependencies;

import org.springframework.stereotype.Component;

@Component
public interface TextWriter {

  public String WriteText(String s);

}
