package com.greenfox.mysqlconnection.repository;

import com.greenfox.mysqlconnection.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
  List<Todo> findTodosByTitleContaining(String text);
}
