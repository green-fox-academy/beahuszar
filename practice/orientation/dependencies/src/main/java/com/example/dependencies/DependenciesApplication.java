package com.example.dependencies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.dependencies.fancyWriter_Erik")
public class DependenciesApplication {

  public static void main(String[] args) {
    SpringApplication.run(DependenciesApplication.class, args);
  }

}

