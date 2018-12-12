package com.workshop.demo.model;

public class BankAccount {
  private String name;
  private double balance;
  private String animalType;
  private boolean isKing;
  private String motives;

  public BankAccount(String name, double balance, String animalType, boolean isKing, String motives) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = isKing;
    this.motives = motives;
  }

  public String getName() {
    return name;
  }

  public double getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public boolean getIsKing() {
    return isKing;
  }

  public String getMotives() {
    return motives;
  }
}
