package com.bea.webshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class MyWebshop {
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
  public String webshop(Model model) {
    model.addAttribute("items", items);
    return "webshop";
  }

  @RequestMapping(value="/only-available")
  public String getOnlyAvailable(Model model) {
    List<Item> onlyAvailable = items
        .stream()
        .filter(onStock -> onStock.getQuantityOnStock() > 0)
        .collect(Collectors.toList());

    model.addAttribute("items", onlyAvailable);
    return "webshop";
  }

  @RequestMapping(value="/cheapest-first")
  public String getCheapestFirst(Model model) {
    List<Item> sorted = items
        .stream()
        .sorted(Comparator.comparing(Item::getPrice))
        .collect(Collectors.toList());
    model.addAttribute("items", sorted);
    return "webshop";
  }

  @RequestMapping(value="/contains-nike")
  public String getNikeProducts(Model model) {
    List<Item> nikes = items
        .stream()
        .filter(nikeItems -> nikeItems.getDescription().toLowerCase().contains("nike"))
        .collect(Collectors.toList());
    model.addAttribute("items", nikes);
    return "webshop";
  }

  @RequestMapping(value="/average-stock")
  public String getAvergaeStock(Model model) {
    double countOfUniqueItems = items.size();
    double countOfStock = items
        .stream()
        .collect(Collectors.summingInt(Item::getQuantityOnStock));
    double averageStock = countOfStock / countOfUniqueItems;

    model.addAttribute("average", averageStock);
    return "average";
  }

  @RequestMapping(value="/most-expensive")
  public String getMostExpensive(Model model) {
    Item mostExpensive = items
        .stream()
        .max(Comparator.comparing(Item::getPrice))
        .get();

    model.addAttribute("items", mostExpensive);
    return "webshop";
  }

  @PostMapping(value="/search")
  public String getKeyWord(String keyWord, Model model) {
    List<Item> searchedItems = items
        .stream()
        .filter(items -> items.getName().toLowerCase().contains(keyWord))
        .filter(items -> items.getDescription().toLowerCase().contains(keyWord))
        .collect(Collectors.toList());
    model.addAttribute("items", searchedItems);
    return "webshop";
  }
}
