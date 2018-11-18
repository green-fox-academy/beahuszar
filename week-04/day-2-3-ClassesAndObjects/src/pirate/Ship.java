package pirate;
import java.util.ArrayList;
import java.util.List;

/*
The ship can be filled with pirates and a captain via fillShip() method.
    - Filling the ship with a captain and random number of pirates.
    - Ships should be represented in a nice way on command line including
        - information about captains consumed rum, state (passed out / died)
        - number of alive pirates in the crew
Ships should have a method to battle other ships: ship.battle(otherShip)
    - should return true if the actual ship (this) wins
      - the ship should win if its calculated score is higher
       - calculate score: Number of Alive pirates in the crew - Number of consumed rum by the captain
    - The loser crew has a random number of losses (deaths).
    - The winner captain and crew has a party, including a random number of rum :)
*/

public class Ship {
  private List<Pirate> crew = new ArrayList();
  private int numOfPirates = 1 + (int) (Math.random() * 50);
  private int captainrounds = 1 + (int) ((Math.random() * 5));
  private Pirate captain = new Pirate();



  public void fillship() {

    for (int i = captainrounds; i > 0; i--) {
      captain.drinkSomeRum();
    }
    for (int i = 0; i <= numOfPirates ; i++) {
      crew.add(new Pirate());
    }
    crew.add(this.captain);

    System.out.println("Number of pirates alive: " + crew.size());
    this.captain.captainStatus();
  }

  public void battle(Ship oppShip) {
    boolean actualShipWon = true;
    int thisShipPoints = this.crew.size() - this.captain.drinkCounter;
    int oppShipPoints = oppShip.crew.size() - oppShip.captain.drinkCounter;

    if (thisShipPoints > oppShipPoints) {
      System.out.println(actualShipWon);
      System.out.println("Let's have " + (int)(Math.random() * 100) + " rums!!");
      for (int i = 0; i < 1 + (int) (Math.random() * oppShip.crew.size()); i++) {
        oppShip.crew.remove(i);
      }

    } else if (oppShipPoints > thisShipPoints) {
      System.out.println(!actualShipWon);
      System.out.println("Let's have " + (int)(Math.random() * 100) + "rums!!");
      for (int i = 0; i < 1 + (int) (Math.random() * this.crew.size()); i++) {
        oppShip.crew.remove(i);
      }
    }
  }
}
