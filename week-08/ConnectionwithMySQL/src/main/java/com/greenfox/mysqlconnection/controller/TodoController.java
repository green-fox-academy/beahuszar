package com.greenfox.mysqlconnection.controller;

import com.greenfox.mysqlconnection.model.Todo;
import com.greenfox.mysqlconnection.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/todo")
public class TodoController {

  TodoService service;

  @Autowired
  public TodoController(TodoService service) {
    this.service = service;
  }

  @GetMapping(value={"/", "/list"})
  public String list(@RequestParam(value = "isActive", required = false) boolean isActive, Model model) {
    if (isActive) {
      model.addAttribute("todos",service.getActiveOnly());
      model.addAttribute("todo",new Todo());
    } else {
      model.addAttribute("todos",service.getTodoList());
      model.addAttribute("todo",new Todo());
    }
    return "todolist";
  }

  @GetMapping("/new")
  public String addform (Model model) {
    model.addAttribute("todo", new Todo());
    return "add";
  }

  @PostMapping("/new")
  public String addNewTodo(@ModelAttribute Todo todo) {
    service.addTodo(todo);
    return "redirect:/todo/";
  }
}
