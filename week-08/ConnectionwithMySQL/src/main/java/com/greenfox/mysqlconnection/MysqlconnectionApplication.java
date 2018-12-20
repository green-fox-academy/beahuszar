package com.greenfox.mysqlconnection;

import com.greenfox.mysqlconnection.model.Assignee;
import com.greenfox.mysqlconnection.model.Todo;
import com.greenfox.mysqlconnection.service.AssigneeService;
import com.greenfox.mysqlconnection.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MysqlconnectionApplication implements CommandLineRunner {
  TodoService service;
  AssigneeService assigneeService;

  @Autowired
  public MysqlconnectionApplication(TodoService service, AssigneeService assigneeService) {
    this.service = service;
    this.assigneeService = assigneeService;
  }



  public static void main(String[] args) {
    SpringApplication.run(MysqlconnectionApplication.class, args);
  }


  @Override
  public void run(String... args) throws Exception {
    service.addTodo(new Todo("wear ugly sweater on the Xmas Party",true, false));
    service.addTodo(new Todo("petting the class' dog",true, true));
    assigneeService.saveAssignees(new Assignee("Blanka", "Hooz", "blanka.hooz@greenfox.com"));
    assigneeService.saveAssignees(new Assignee("Gabor", "Wermer", "gabor.wermer@greenfox.com"));
    assigneeService.saveAssignees(new Assignee("Istvan", "Karasz", "istvan.karasz@greenfox.com"));
  }
}

