package com.greenfox.mysqlconnection.controller;

import com.greenfox.mysqlconnection.model.Todo;
import com.greenfox.mysqlconnection.service.AssigneeService;
import com.greenfox.mysqlconnection.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {

  TodoService service;
  AssigneeService assigneeService;

  @Autowired
  public TodoController(TodoService service, AssigneeService assigneeService) {
    this.service = service;
    this.assigneeService = assigneeService;
  }

  @GetMapping(value={"/", "/list"})
  public String list(@RequestParam(value = "isActive", required = false) boolean isActive, Model model) {
    if (isActive) {
      model.addAttribute("todos",service.getActiveOnly());
    } else {
      model.addAttribute("todos",service.getTodoList());
    }
    return "todo/todolist";
  }

  @GetMapping("/new")
  public String addform (Model model) {
    model.addAttribute("todo", new Todo());
    return "todo/add";
  }

  @PostMapping("/new")
  public String addNewTodo(@ModelAttribute Todo todo) {
    service.addTodo(todo);
    return "redirect:/todo/";
  }

  @GetMapping("/{id}/delete")
  public String delete(@PathVariable long id) {
    service.deleteToDoById(id);
    return "redirect:/todo/";
  }

  @GetMapping("/{id}/edit")
  public String editForm(@PathVariable long id, Model model) {
    model.addAttribute("todo", service.getToDoById(id));
    model.addAttribute("assignees", assigneeService.getListOfAssignee());
    return "todo/edit";
  }

  @PostMapping("/{id}/edit")
  public String postEdit(@ModelAttribute Todo todo) {
    service.addTodo(todo);
    return "redirect:/todo/";
  }

  @PostMapping("/search")
  public String searchToDo(String text, Model model) {
    model.addAttribute("todos", service.findToDoByKeyWord(text));
    return "todo/todolist";
  }
}
