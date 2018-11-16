package pirate;

public class Pirate {
  private int intoxication;
  private int drinkCounter;
  boolean death = false;

  public Pirate() {

  }

  public Pirate(int intoxication) {
    this.intoxication = intoxication;
  }


  public int drinkSomeRum() {
    drinkCounter++;
    return intoxication ++;
  }

  public void howsItGoingMate(Pirate x) {
    String reply;

    if (death == true) {
      reply = "I am dead...khkhkggkhhhhh";
    } else if (drinkCounter < 5) {
      reply = "Pour me anudder!";
    } else {
      reply = "Arghh, I'ma Pirate. How d'ya d'ink its goin?......ZZZZZzzzzzzzz";
    }
    System.out.println(reply);
  }

  public void die(Pirate x) {
    death = true;
  }

  public void brawl(Pirate opp1, Pirate opp2) {
    int chance = (int)(1 + Math.random() * 3);

    if (opp1.death = true) {
      System.out.println(opp1 + " is already dead..why would you fight him??");
    } else if (opp2.death = true) {
      System.out.println(opp2 + " is already dead..why would you fight him??");
    } else if (chance == 1) {
      System.out.println(opp1.toString() + " won");
    } else if (chance == 2) {
      System.out.println(opp2.toString() + "won");
    } else {
      System.out.println("Both passed out");
    }
  }

  public void parrot () {
    System.out.println("I am a parrot, squak, squak");
  }
}
