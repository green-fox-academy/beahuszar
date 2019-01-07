package com.greenfox.frontend.service;

import org.springframework.stereotype.Service;

@Service
public class DoublingService {
  public int getDouble(int input) {
    return input * 2;
  }
}
