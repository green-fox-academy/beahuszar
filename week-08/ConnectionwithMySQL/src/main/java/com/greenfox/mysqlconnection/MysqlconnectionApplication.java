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
public class MysqlconnectionApplication {

  public static void main(String[] args) {
    SpringApplication.run(MysqlconnectionApplication.class, args);
  }
}

