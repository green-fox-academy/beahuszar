package com.greenfox.mysqlconnection;

import com.greenfox.mysqlconnection.model.Asignee;
import com.greenfox.mysqlconnection.model.Todo;
import com.greenfox.mysqlconnection.service.AsigneeService;
import com.greenfox.mysqlconnection.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MysqlconnectionApplication implements CommandLineRunner {
  TodoService service;
  AsigneeService asigneeService;

  @Autowired
  public MysqlconnectionApplication(TodoService service, AsigneeService asigneeService) {
    this.service = service;
    this.asigneeService = asigneeService;
  }



  public static void main(String[] args) {
    SpringApplication.run(MysqlconnectionApplication.class, args);
  }


  @Override
  public void run(String... args) throws Exception {
    service.addTodo(new Todo("proba"));
    service.addTodo(new Todo("wear ugly sweater on the Xmas Party",true, false));
    service.addTodo(new Todo("petting the class' dog",true, true));
    asigneeService.saveAsignees(new Asignee("Blanka", "Hooz", "blanka.hooz@greenfox.com"));
    asigneeService.saveAsignees(new Asignee("Gabor", "Wermer", "gabor.wermer@greenfox.com"));
    asigneeService.saveAsignees(new Asignee("Istvan", "Karasz", "istvan.karasz@greenfox.com"));
  }
}

