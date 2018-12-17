package com.greenfox.todos.controller;

import com.greenfox.todos.model.Todo;
import com.greenfox.todos.repository.TodoRepository;
import com.greenfox.todos.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/todo")
public class TodoController {

  TodoService service;

  public TodoController(TodoService service) {
    this.service = service;
  }

  @GetMapping(value={"/", "/list"})
  public String list(Model model) {
    model.addAttribute("todos", service.getTodoList());
    return "todolist";
  }
}
