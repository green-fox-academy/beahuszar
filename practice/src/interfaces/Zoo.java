package interfaces;

public class Zoo {
  public static void main(String[] args) {
//    Animal animal1 = new Animal(12, "M", 23);
//    animal1.eat();

    Bird bird1 = new Bird(3, "F", 10);
    bird1.eat();
    bird1.sleep();

    /*Chicken chick1 = new Chicken(1, "M", 7);
    chick1.fly();*/ //worked when Bird had the fly() method

    Animal littleOne = new Sparrow(3,"F",10);
    littleOne.move();

    Animal fish = new Fish(1,"M",2);
    fish.move();

    moveAnimals(fish);
    moveAnimals(littleOne);

    Flyable flyingBird = new Sparrow(1,"m",4);
   // Flyable flyingBird2 = new Bird(1,"m",4); flyable is not implement in Bird thus it will not work
    flyingBird.fly();

  }

  public static void moveAnimals(Animal animal) {
    animal.move();
  }


}
