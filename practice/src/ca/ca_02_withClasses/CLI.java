package ca.ca_02_withClasses;
import java.util.ArrayList;
import java.util.Scanner;

public class CLI {
  private Scanner input;

  CLI() {
    input = new Scanner(System.in);
  }

  public char getCommand() {
    System.out.println("Please tell me what to do");
    System.out.println("Add new product [a]");
    System.out.println("Print stock [p]");
    System.out.println("Quit [q]");
    return this.input.nextLine().charAt(0);
  }

  public Product readProduct() {
    System.out.println("please provide product info:");
    System.out.println("Id: ");
    int id = input.nextInt();
    input.nextLine();
    System.out.println("Name: ");
    String name = input.nextLine();
    System.out.println("Qty: ");
    int qty = input.nextInt();
    input.nextLine();
    System.out.println("Price: ");
    int price = input.nextInt();
    input.nextLine();

    return new Product(id, name, qty, price);
  }

  public static void printProducts(ArrayList<Product> productsToPrint) {
    for(Product product: productsToPrint) {
      printProduct(product);
    }
  }

  public static void printProduct(Product productToPrint) {
    System.out.println(productToPrint);
  }
}
