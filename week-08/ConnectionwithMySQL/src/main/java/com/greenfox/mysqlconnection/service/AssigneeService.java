package com.greenfox.mysqlconnection.service;

import com.greenfox.mysqlconnection.model.Assignee;
import com.greenfox.mysqlconnection.model.Todo;
import com.greenfox.mysqlconnection.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssigneeService {

  AssigneeRepository assigneeRepository;

  @Autowired
  public AssigneeService(AssigneeRepository assigneeRepository) {
    this.assigneeRepository = assigneeRepository;
  }

  public void saveAssignees(Assignee assignee) {
    if (assignee != null) {
      assigneeRepository.save(assignee);
    }
  }

  public List<Assignee> getListOfAssignee() {
    List<Assignee> assignees = new ArrayList<>();
    assigneeRepository.findAll().forEach(assignees::add);
    return assignees;
  }

  public Assignee getAssignee(long id) {
    return assigneeRepository.findById(id).orElse(null);
  }

  public void deleteAssignee(long id) {
    assigneeRepository.findById(id).get().getTodoList().forEach(todo -> todo.setAssignee(null));
    assigneeRepository.deleteById(id);
  }

  public List<Todo> getTodosByAsignee(long id) {
    List<Todo> todoList = new ArrayList<>();
    assigneeRepository.findById(id).get().getTodoList().forEach(todoList::add);
    return todoList;
  }
}
