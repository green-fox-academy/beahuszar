package com.example.colors.services;

import org.springframework.stereotype.Service;

@Service
public class Printer {
  public void log(String message) {
    System.out.println(message);
  }
}
