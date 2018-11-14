package farm;
import animal.Animal;
import animal.Main;

import java.util.List;

/*Reuse your Animal class
Create a Farm class
it has list of Animals
        it has slots which defines the number of free places for animals
    breed() -> creates a new animal if there's place for it
    slaughter() -> removes the least hungry animal*/

public class Farm {
  int slots;
  public List<Animal> animalList;

  public Farm (){
    this.slots = 20;
  }


  public void breed() {
    if (slots > 0) {
      animalList.add(new Animal());
    } else slaughter();
  }

  public void slaughter() {
    int hungerLevel;
    hungerLevel = animalList.get(0).hunger;
    Animal index =  new Animal();

    for (Animal noe : animalList) {
      if (noe.hunger > hungerLevel ) {
        index = noe;
      }
    }
    animalList.remove(index);
  }


}
