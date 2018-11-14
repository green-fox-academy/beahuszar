package OOP;

class Machine {
    private String name;
    private int code;

    public Machine () {
        this("Arnie",0); //it ALWAYS needs to be the first line
        System.out.println("Constructor running");
        name = "arnie";
    }

    public Machine (String name) {
        System.out.println("second constructor running");
        this.name = name;
    }

    public Machine(String name, int code){
        System.out.println("Third constructor running");
        this.name = name;
        this.code = code;
    }
}
public class Constructors {
    public static void main(String[] args) {
      Machine machine1 = new Machine();
      Machine machine2 = new Machine("Bertie");
      Machine machine3 = new Machine("Chalky", 7);
    }
}
