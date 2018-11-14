package animal;
import farm.Farm;

import java.util.List;

public class Main {


    public static void main(String[] args) {
      Animal lion = new Animal();
      System.out.println(lion.eat());
      System.out.println(lion.eat());
      System.out.println(lion.drink());
      lion.play();
      System.out.println("Hunger: " + lion.hunger + " Thirst: " + lion.thirst);

      Farm myFarm = new Farm();
      myFarm.breed();

    }


}
