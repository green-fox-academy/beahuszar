package ca.ca_02_withClasses;

public class Product {
  public int qty;
  private int id;
  private String name;
  private double price;

  Product() {
    this.qty = 0;
  }

  Product(int id, String name, int qty, double price) {
    this.id = id;
    this.qty = qty;
    this.name = name;
    this.price = price;
  }

  public int getId() {
    return this.id;
  }

  public String toString() {
    return this.qty + " pieces of " + this.name;
  }
}
