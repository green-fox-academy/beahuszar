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

  public List<Todo> getTodoList() {
    List<Todo> todoList = new ArrayList<>();
    todoRepository.findAll().forEach(todoList::add);
    return todoList;
  }

  public List<Todo> getActiveOnly() {
    List<Todo> activeOnly = getTodoList()
        .stream()
        .filter(todo -> !todo.getIsDone())
        .collect(Collectors.toList());
    return activeOnly;
  }

  public void deleteToDoById(long id) {
    todoRepository.deleteById(id);
  }

  public Todo getToDoById(long id) {
    return todoRepository.findById(id).orElse(null);
  }

  public List<Todo> findToDoByKeyWord(String text) {
    return todoRepository.findTodosByTitleContaining(text);
  }
}
