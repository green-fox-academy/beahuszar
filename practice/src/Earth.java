public class Earth {
    public static void main(String[] args) {
      Human tom;
      tom = new Human();
      tom.age = 5;
      tom.eyeColor = "brown";
      tom.heightInInches = 72;
      tom.name = "Tom Szabo";
      tom.speak();

      Human john = new Human();
      john.age = 50;
      john.eyeColor = "blue";
      john.heightInInches = 90;
      john.name = "John Bon Jovi";
      john.speak();
    }

}
