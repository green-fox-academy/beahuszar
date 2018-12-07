package com.bea.webshop;

import java.util.Currency;

public class Item extends Shop {

  private String name;
  private String description;
  private Currency currency;
  private String price;
  private int quantityOnStock;

  public Item(String name, String description, String price, int quantityOnStock) {
    this.name = name;
    this.description = description;
    this.currency = Currency.getInstance("Kd");
    this.price = price + this.currency;
    this.quantityOnStock = quantityOnStock;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public Currency getCurrency() {
    return currency;
  }

  public String getPrice() {
    return price;
  }

  public int getQuantityOnStock() {
    return quantityOnStock;
  }
}
