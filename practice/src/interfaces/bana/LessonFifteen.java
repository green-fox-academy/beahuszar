package interfaces.bana;

public class LessonFifteen {
  public static void main(String[] args) {
    Vehicle car = new Vehicle(4,100.00);

    System.out.println("Cars Max Speed" + car.getSpeed());
    System.out.println("Num of wheels" + car.getWheel());

    car.setCarStrenght(10);
    System.out.println("Strenght" + car.getCarStrenght());
  }
}
