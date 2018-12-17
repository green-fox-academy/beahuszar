package com.greenfox.mysqlconnection.service;


import com.greenfox.mysqlconnection.model.Todo;
import com.greenfox.mysqlconnection.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

  public Todo updateToDo(long id, String title, boolean isUrgent, boolean isDone) {
    Todo todo = todoRepository.findById(id).orElse(null);
    if(title.length() != 0) {
      todo.setTitle(title);
    }
    if(isDone) {
      todo.setDone(true);
    } else {
      todo.setDone(false);
    }
    if(isUrgent) {
      todo.setUrgent(true);
    } else {
      todo.setUrgent(false);
    }
    return todo;
  }

  public List<Todo> getTodoList() {
    List<Todo> todoList = new ArrayList<>();
    todoRepository.findAll().forEach(todoList::add);
    return todoList;
  }

  public List<Todo> getActiveOnly() {
    List<Todo> activeOnly = getTodoList()
        .stream()
        .filter(todo -> !todo.isDone())
        .collect(Collectors.toList());
    return activeOnly;
  }

  public void deleteToDoById(long id) {
    todoRepository.deleteById(id);
  }

  public Todo getToDoById(long id) {
    return todoRepository.findById(id).orElse(null);
  }

}
