package com.greenfox.todos;

import com.greenfox.todos.model.Todo;
import com.greenfox.todos.repository.TodoRepository;
import com.greenfox.todos.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodosApplication implements CommandLineRunner {

  TodoService service;

  @Autowired
  public TodosApplication(TodoService service) {
    this.service = service;
  }

  public static void main(String[] args) {
    SpringApplication.run(TodosApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    service.addTodo(new Todo("Learn object relational mapping"));
    service.addTodo(new Todo("Sleep more"));
    service.addTodo(new Todo("Find the meaning of life"));
    service.addTodo(new Todo("Have lunch"));
  }
}

