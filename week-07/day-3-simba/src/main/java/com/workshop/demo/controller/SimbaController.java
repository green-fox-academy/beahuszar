package com.workshop.demo.controller;

import com.workshop.demo.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SimbaController {
  List<BankAccount> bankAccounts = new ArrayList<>();

  public SimbaController() {
    bankAccounts.add(new BankAccount("Nala", 30000, "lion", false));
    bankAccounts.add(new BankAccount("Zazoo", 30, "Red-billed hornbill", false));
    bankAccounts.add(new BankAccount("Pumba", 7323487, "boar", false));
    bankAccounts.add(new BankAccount("Timon", 1234, "meerkat",false));
    bankAccounts.add(new BankAccount("Simba", 1000000, "lion",true));
  }

  @RequestMapping(path = "/show", method = RequestMethod.GET )
  public String showAccount(Model model) {
    BankAccount bankAccount = new BankAccount("Simba", 2000, "lion", true);

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
}
