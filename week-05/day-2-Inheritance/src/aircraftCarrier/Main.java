package aircraftCarrier;

public class Main {
  public static void main(String[] args) {
    Aircraft f16 = new Aircraft(30,8,"F16");
    Aircraft f35 = new Aircraft(50,12,"F35");

    System.out.println(f16.getType());
    f16.refill(20);
    System.out.println(f16.getStatus());
  }
}
