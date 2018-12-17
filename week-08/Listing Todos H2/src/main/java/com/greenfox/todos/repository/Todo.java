package com.greenfox.todos.repository;

public class Todo {
   long id;
   String title;
   boolean urgent;
   boolean done;

  public Todo(long id, String title) {
    this.id = id;
    this.title = title;
    this.urgent = false;
    this.done = false;
  }


}
