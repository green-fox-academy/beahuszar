package com.example.colors.services;

import org.springframework.beans.factory.annotation.Autowired;

public class RedColor implements MyColor {
  Printer printer;

  @Autowired
  public RedColor(Printer printer) {
    this.printer = printer;
  }

  @Override
  public void printColor() {
    printer.log(this.getClass().getSimpleName());
  }
}
