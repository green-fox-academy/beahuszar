package comparable;

import java.util.Date;

public class TodoItem implements Comparable<TodoItem> {
  private Date deadline;
  private String name;
  private boolean isCompleted;

  public TodoItem(String name) {
    this.name = name;
    this.isCompleted = false;
    this.deadline = null;
  }

  public TodoItem(String name, Date deadline) {
    this.name = name;
    this.isCompleted = false;
    this.deadline = deadline;
  }

  public TodoItem(String name, boolean isCompleted) {
    this.name = name;
    this.isCompleted = isCompleted;
    this.deadline = null;
  }

  public String getName() {
    return name;
  }

  public boolean isCompleted() {
    return isCompleted;
  }

  @Override
  public int compareTo(TodoItem o) {
    if(o.isCompleted() != this.isCompleted()) {
      if(this.isCompleted()) {
        return 1;
      }
      return -1;
    }
    return this.name.compareTo(o.getName());
  }

  @Override
  public String toString() {
    return this.getName() + " is completed: " + this.isCompleted();
  }
}
