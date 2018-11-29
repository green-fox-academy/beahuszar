import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.FileHandler;

public class Main {
  private static ArrayList<HashMap<String, Object>> products = new ArrayList();

  public static void main(String[] args) {
    CommandLine CLI = new CommandLine();
    Todo todo;
    FileHandler fileHandler = new FileHandler();
    TodoList myToDos = new TodoList();

    boolean keepGoing = true;

    while (keepGoing) {
      String nextcommand = args[0];
      switch (nextcommand) {
        case "-l":
          //Lists all the tasks
          break;
        case "-a":
          //Adds a new task
          Todo newTodo = CLI.readTodo();
          myToDos.addToDo(newTodo);
          break;
        case "-r":
          //Removes a task
          break;
        case "-c":
          //Completes a task
          break;
        default:
          keepGoing = true;
      }
    }
  }
}
