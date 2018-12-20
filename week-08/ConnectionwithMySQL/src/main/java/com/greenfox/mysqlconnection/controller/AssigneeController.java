package com.greenfox.mysqlconnection.controller;

import com.greenfox.mysqlconnection.model.Assignee;
import com.greenfox.mysqlconnection.service.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo/assignee")
public class AssigneeController {

  AssigneeService assigneeService;

  @Autowired
  public AssigneeController(AssigneeService assigneeService) {
    this.assigneeService = assigneeService;
  }

  @GetMapping("/")
  public String view(Model model) {
    model.addAttribute("assigneeList", assigneeService.getListOfAssignee());
    return "assignee/assignee";
  }

  @GetMapping("/edit/{id}")
  public String editAssignee(@PathVariable long id, Model model) {
    model.addAttribute("assignee", assigneeService.getAssignee(id));
    return "assignee/editAssignee";
  }

  @PostMapping("/edit/{id}")
  public String editAssignee(@ModelAttribute Assignee assignee) {
    assigneeService.saveAssignees(assignee);
    return "redirect:/todo/assignee/";
  }

  @GetMapping("/delete/{id}")
  public String deleteAssignee(@PathVariable long id) {
    assigneeService.deleteAssignee(id);
    return "redirect:/todo/assignee/";
  }

  @GetMapping("/addassignee")
  public String addAssignee(Model model) {
    model.addAttribute("assignee", new Assignee());
    return "assignee/addAssignee";
  }

  @PostMapping("/addassignee")
  public String addAssignee(@ModelAttribute Assignee assignee) {
    assigneeService.saveAssignees(assignee);
    return "redirect:/todo/assignee/";
  }

  @GetMapping("/assigneetodo/{id}")
  public String listTodosByAssignee(@PathVariable long id, Model model) {
    model.addAttribute("todos", assigneeService.getTodosByAsignee(id));
    return "assignee/todobyassignee";
  }
}
