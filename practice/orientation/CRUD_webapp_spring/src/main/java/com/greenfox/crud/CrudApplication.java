package com.greenfox.crud;

import com.greenfox.crud.domain.Post;
import com.greenfox.crud.domain.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication implements CommandLineRunner {

  @Autowired
  private PostRepo repository;

  public static void main(String[] args) {
    SpringApplication.run(CrudApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    for (int i = 0; i < 5; i++) {
      repository.save(new Post("my post number #" + (i + 1)));
    }
  }
}

