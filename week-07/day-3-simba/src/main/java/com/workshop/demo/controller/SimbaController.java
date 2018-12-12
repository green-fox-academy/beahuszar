package com.workshop.demo.controller;

import com.workshop.demo.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimbaController {

  @RequestMapping(path = "/show", method = RequestMethod.GET )
  public String showAccount(Model model) {
    BankAccount bankAccount = new BankAccount("Simba", 2000, "lion");

    model.addAttribute("bankaccount",bankAccount);

    return "index";
  }

  @RequestMapping(path = "/ception", method = RequestMethod.GET )
  @ResponseBody
  public String showCeption() {
    return "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
  }
}
