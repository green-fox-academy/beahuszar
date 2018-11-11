import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CA {

        private static ArrayList<HashMap<String, Object>> products = new ArrayList();

        public static void main(String[] args) {

            boolean keepGoing = true;

            while(keepGoing) {
                String nextCommand = getNextCommand();
                switch(nextCommand) {
                    case "a":
                        HashMap<String, Object> newProd = readProduct();
                        addProduct(newProd);
                        break;
                    case "p":
                        printProducts(getProducts());
                        break;
                    case "q":
                        keepGoing = false;
                        break;
                }
            }
        }

        private static String getNextCommand() {
            Scanner input = new Scanner(System.in);

            System.out.println("Please tell me what to do");
            System.out.println("Add new product: a");
            System.out.println("Print stock: p");
            System.out.println("Quit: q");
            return input.nextLine();
        }

        private static HashMap<String, Object> readProduct() {
            Scanner input = new Scanner(System.in);


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


            HashMap<String, Object> newProduct = new HashMap();
            newProduct.put("id", id);
            newProduct.put("name", name);
            newProduct.put("qty", qty);
            newProduct.put("price", price);

            return newProduct;
        }

        public static void addProduct(HashMap<String, Object> newProduct) {
            boolean isInStock = false;
            for(HashMap<String, Object> product: products) {
                if(product.get("id") == newProduct.get("id")) {
                    isInStock = true;
                    product.put("qty", (int) product.get("qty") + (int) newProduct.get("qty"));
                }
            }
            if(!isInStock) {
                products.add(newProduct);
            }
        }

        public static HashMap<String, Object> getProduct(int id) {
            for(HashMap<String, Object> product: products) {
                if((int)product.get("id") == id) {
                    return product;
                }
            }
            return null;
        }

        public static ArrayList<HashMap<String, Object>> getProducts() {
            return products;
        }

        public static void printProducts(ArrayList<HashMap<String, Object>> productsToPrint) {
            for(HashMap<String, Object> product: productsToPrint) {
                printProduct(product);
            }
        }

        public static void printProduct(HashMap<String, Object> productToPrint) {
            System.out.println(productToPrint);
        }
}
