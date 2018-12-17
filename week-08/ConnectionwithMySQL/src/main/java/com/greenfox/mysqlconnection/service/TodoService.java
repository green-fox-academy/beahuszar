package com.greenfox.mysqlconnection.service;


import com.greenfox.mysqlconnection.model.Todo;
import com.greenfox.mysqlconnection.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

  TodoRepository todoRepository;

  @Autowired
  public TodoService(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public void addTodo(Todo todo) {
    if (todo != null) {
      todoRepository.save(todo);
    }
  }

  public List<Todo> getTodoList() {
    List<Todo> todoList = new ArrayList<>();
    todoRepository.findAll().forEach(todoList::add);
    return todoList;
  }
}
