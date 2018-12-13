package com.example.colors.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BeigeColor implements MyColor {

  Printer printer;

  @Autowired
  public BeigeColor(Printer printer) {
    this.printer = printer;
  }
  @Override
  public void printColor() {
    printer.log(this.getClass().getSimpleName());
  }
}
