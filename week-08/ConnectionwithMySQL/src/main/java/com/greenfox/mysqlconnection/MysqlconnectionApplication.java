package com.greenfox.mysqlconnection;

import com.greenfox.mysqlconnection.model.Todo;
import com.greenfox.mysqlconnection.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MysqlconnectionApplication implements CommandLineRunner {
  TodoService service;

  @Autowired
  public MysqlconnectionApplication(TodoService service) {
    this.service = service;
  }

  public static void main(String[] args) {
    SpringApplication.run(MysqlconnectionApplication.class, args);
  }


  @Override
  public void run(String... args) throws Exception {
    service.addTodo(new Todo("proba"));
    service.addTodo(new Todo("wear ugly sweater on the Xmas Party",true, false));
    service.addTodo(new Todo("petting the class' dog",true, true));
  }
}

