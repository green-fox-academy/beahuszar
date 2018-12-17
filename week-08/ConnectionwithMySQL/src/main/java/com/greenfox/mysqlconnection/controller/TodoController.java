package com.greenfox.mysqlconnection.controller;

import com.greenfox.mysqlconnection.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class TodoController {

  TodoService service;

  @Autowired
  public TodoController(TodoService service) {
    this.service = service;
  }

  @GetMapping(value={"/", "/list"})
  public String list(Model model) {
    model.addAttribute("todos", service.getTodoList());
    return "todolist";
  }
}
