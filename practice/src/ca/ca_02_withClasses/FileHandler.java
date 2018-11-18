package ca.ca_02_withClasses;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileHandler {
  public void saveProducts(ArrayList<Product> products, String fileName) {
    Path file = Paths.get(fileName);
    ArrayList<String> fileContent = new ArrayList(); // to convert object list to string list

    for(Product product : products) {
      fileContent.add(product.toString()); //adding objects as strings in the new list
    }

    try {
      Files.write(file, fileContent, Charset.forName("UTF-8"));
    } catch(IOException ex) {
      System.out.println("cannot save products: " + ex.getMessage());
    }
  }
}
