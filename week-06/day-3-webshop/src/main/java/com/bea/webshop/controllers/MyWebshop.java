package com.bea.webshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MyWebshop {
  Item item;
  List<Item> items;

  public MyWebshop() {
    items = new ArrayList<>();
    items.add(new Item("Running shoes","Nike running shoes for everyday sport",1000,5));
    items.add(new Item("Printer","Some HP printer that will print pages",3000,2));
    items.add(new Item("Coca Cola","0.5l standard coke",25,0));
    items.add(new Item("Wokin","Chicken with fried rice and WOKIN sauce",119,100));
    items.add(new Item("T-shirt","Blue with a corgi on a bike",300,1));
  }


  @RequestMapping(value="/webshop")
  public String greeting(Model model) {
    model.addAttribute("items", items);
    return "webshop";
  }
}
