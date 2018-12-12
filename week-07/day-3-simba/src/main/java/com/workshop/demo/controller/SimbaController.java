package com.workshop.demo.controller;

import com.workshop.demo.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SimbaController {
  List<BankAccount> bankAccounts = new ArrayList<>();

  public SimbaController() {
    bankAccounts.add(new BankAccount("Nala", 30000, "lion", false, false));
    bankAccounts.add(new BankAccount("Zazoo", 30, "Red-billed hornbill", false,true));
    bankAccounts.add(new BankAccount("Pumba", 7323487, "boar", false,true));
    bankAccounts.add(new BankAccount("Timon", 1234, "meerkat",false,true));
    bankAccounts.add(new BankAccount("Simba", 1000000, "lion",true,true));
  }

  @RequestMapping(path = "/show", method = RequestMethod.GET )
  public String showAccount(Model model) {
    BankAccount bankAccount = new BankAccount("Simba", 2000, "lion", true,true);

    model.addAttribute("bankaccount",bankAccount);

    return "index";
  }

  @RequestMapping(path = "/ception", method = RequestMethod.GET )
  public String showCeption(Model model) {
    String text = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";

    model.addAttribute("text",text);
    return "ception";
  }

  @RequestMapping(path = "/table", method = RequestMethod.GET )
  public String showTable(Model model) {
    model.addAttribute("accounts",bankAccounts);
    return "table";
  }

  @PostMapping("/increment")
  public String incrementAccount(String id) {
    if (bankAccounts.get(Integer.parseInt(id)).getIsKing()) {
      bankAccounts.get(Integer.parseInt(id)).setBalance(100);
    } else {
      bankAccounts.get(Integer.parseInt(id)).setBalance(10);
    }
    return "redirect:/table";
  }
}
