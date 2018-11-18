package ca.ca_02_withClasses;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
  private static ArrayList<HashMap<String, Object>> products = new ArrayList();

  public static void main(String[] args) {
    CLI commandLine = new CLI();
    Warehouse warehouse = new Warehouse();
    FileHandler fileHandler = new FileHandler();

    boolean keepGoing = true;

    while (keepGoing) {
      char nextCommand = commandLine.getCommand();
      switch (nextCommand) {
        case 'a':
          Product newProd = commandLine.readProduct();
          warehouse.addProduct(newProd);
          break;
        case 'p':
          ArrayList<Product> productsToPrint = warehouse.getProducts();
          commandLine.printProducts(productsToPrint);
          break;
        case 's':
          ArrayList<Product> productsToSave = warehouse.getProducts();
          fileHandler.saveProducts(productsToSave, "db/products.txt");
          break;
        case 'q':
          keepGoing = false;
          break;
        default:
          keepGoing = true;
      }
    }
  }
}
