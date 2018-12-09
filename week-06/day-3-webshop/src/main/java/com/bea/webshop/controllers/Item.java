package com.bea.webshop.controllers;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class Item {

  private String name;
  private String description;
  private int price;
  private int quantityOnStock;

  public Item(String name, String description, int price, int quantityOnStock) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantityOnStock = quantityOnStock;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public int getPrice() {
    return price;
  }

  public int getQuantityOnStock() {
    return quantityOnStock;
  }
}
