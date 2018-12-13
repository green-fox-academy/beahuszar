package com.example.colors;

import com.example.colors.services.BeigeColor;
import com.example.colors.services.MyColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColorsApplication implements CommandLineRunner {

  @Autowired
  MyColor myColor;

  public static void main(String[] args) {
    SpringApplication.run(ColorsApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    myColor.printColor();
  }
}

