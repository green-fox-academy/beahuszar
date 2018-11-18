package ca.ca_02_withClasses;
import java.util.ArrayList;

public class Warehouse {
  private ArrayList<Product> products;

  Warehouse() {
    this.products = new ArrayList();
  }

  public void addProduct(Product prod) {
    boolean isInStock = false;
    for(Product product: products) {
      if(product.getId() == prod.getId()) {
        isInStock = true;
        product.qty = product.qty + prod.qty;
      }
    }
    if(!isInStock) {
      products.add(prod);
    }
  }

  public ArrayList<Product> getProducts() {
    return this.products;
  }

  public Product getProduct(int id) {
    for(Product product: this.products) {
      if(product.getId() == id) {
        return product;
      }
    }
    return null;
  }
}
