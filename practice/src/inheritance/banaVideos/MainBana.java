package inheritance.banaVideos;

public class MainBana {
  public static void main(String[] args) {
    SuperClassBana_Animal genericAnimal = new SuperClassBana_Animal();
    System.out.println(genericAnimal.getName());
    System.out.println(genericAnimal.favFood);

    SubClassBana_Cats morris = new SubClassBana_Cats("Morris", "Tuna", "Rubber Mouse");
    System.out.println();
    System.out.println(morris.getName());
    System.out.println(morris.favFood);
    System.out.println(morris.favToy);

    SuperClassBana_Animal tabby = new SubClassBana_Cats("Tabby", "Salmon", "Ball"); //it can be casted as Cat is a subclass of animal
    acceptAnimal(tabby);
  }

  public static void acceptAnimal(SuperClassBana_Animal randAnimal) {
    System.out.println();
    System.out.println(randAnimal.getName());
    System.out.println(randAnimal.favFood);

    randAnimal.walkAround(); //will use cat's overridden walkaround method

//    System.out.println(randAnimal.favToy); //not working, because it is only in the subclass (Cat), superclass (Animal) does not have it
    SubClassBana_Cats tempCat = (SubClassBana_Cats) randAnimal; //casting a superclass object to a subclass object
    System.out.println(tempCat.favToy);  //it is working now

    System.out.println(((SubClassBana_Cats)randAnimal).favToy);  //another way to make it work

    if (randAnimal instanceof SubClassBana_Cats) {  //to check whether it is the instance of the class
      System.out.println(randAnimal.getName() + " is a Cat");
    }

  }
}
