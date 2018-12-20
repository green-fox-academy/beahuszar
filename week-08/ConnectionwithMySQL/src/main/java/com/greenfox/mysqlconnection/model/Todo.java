package com.greenfox.mysqlconnection.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "todos")
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String title;
  private boolean isUrgent;
  private boolean isDone;

  @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
  @JoinColumn(name = "assignee_id")
  private Assignee assignee;

  public Todo() {
  }

  public Todo(String title) {
    this.title = title;
    this.isUrgent = false;
    this.isDone = false;
  }

  public Todo(String title, boolean isUrgent, boolean isDone) {
    this.title = title;
    this.isUrgent = isUrgent;
    this.isDone = isDone;
  }

  public long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public boolean getIsUrgent() {
    return isUrgent;
  }

  public boolean getIsDone() {
    return isDone;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setIsUrgent(boolean urgent) {
    isUrgent = urgent;
  }

  public void setIsDone(boolean done) {
    isDone = done;
  }

  public Assignee getAssignee() {
    return assignee;
  }

  public void setAssignee(Assignee assignee) {
    this.assignee = assignee;
  }
}
