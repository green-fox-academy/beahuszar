package pirate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
Have a armada.war(otherArmada) method where two armada can engage in war
    it should work like merge sort
    first ship from the first armada battles the first of the other
    the loser gets skipped so the next ship comes in play from that armada
    whichever armada gets to the end of its ships loses the war
    return true if this is the winner
*/

public class Armada {
  List<Ship> armada = new ArrayList();
  private int numberOfShips = 1 + (int)(Math.random() * 5);
  private Ship ship;

  public void recruitArmada () {
    for (int i = 0; i < numberOfShips ; i++) {
      ship = new Ship();
      ship.fillship();
      armada.add(ship);
    }
  }

  public void war(Armada opp) {
    System.out.println("Let the war begin!");

    while ((this.armada.size() > 0) && (opp.armada.size() > 0)) {
      if (this.armada.get(0).battle(opp.armada.get(0)) == true) {
        opp.armada.remove(0);
      } else {
        this.armada.remove(0);
      }
      System.out.println("Origi armada: " + this.armada.size());
      System.out.println("Opponent armada: " + opp.armada.size());
    }

    if (this.armada.size() > opp.armada.size()) {
      System.out.println("Origi won");
    } else {
      System.out.println("Opp won");
    }

  }




}
