import java.util.Scanner;

public class CommandLine {
  protected Scanner input;
  public Todo todo;

  CommandLine() {
    this.input = new Scanner(System.in);
  }

  public void printUsageInfo() {
    System.out.println("Command Line Todo application");
    System.out.println("=============================");
    System.out.println();
    System.out.println("Command line arguments:");
    System.out.println("-l   Lists all the tasks");
    System.out.println("-a   Adds a new task");
    System.out.println("-r   Removes a task");
    System.out.println("-c   Completes a task");
  }

  public Todo readTodo() {
    System.out.println("Add your ToDo Item below");
    String todo = input.nextLine();
    return new Todo(todo);
  }


}
