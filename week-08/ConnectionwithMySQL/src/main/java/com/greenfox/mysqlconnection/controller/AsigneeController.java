package com.greenfox.mysqlconnection.controller;

import com.greenfox.mysqlconnection.service.AsigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo/asignee")
public class AsigneeController {

  AsigneeService asigneeService;

  @Autowired
  public AsigneeController(AsigneeService asigneeService) {
    this.asigneeService = asigneeService;
  }

  @GetMapping("/")
  public String view(Model model) {
    model.addAttribute("asigneeList", asigneeService.getListOfAsignee());
    return "asignee";
  }
}
