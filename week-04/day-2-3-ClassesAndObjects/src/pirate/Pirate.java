package pirate;

import java.util.Scanner;

public class Pirate {
  private int intoxication;
  private int drinkCounter;
  boolean death = false;
  boolean passedout = false;

  public Pirate() {

  }

  public Pirate(int intoxication) {
    this.intoxication = intoxication;
  }


  public int drinkSomeRum() {
    drinkCounter++;
    return intoxication ++;
  }

  public void howsItGoingMate() {
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

  public void die() {
    death = true;
  }

  public void brawl(Pirate opp) {
    int chance = (int)(1 + Math.random() * 3);

    if (this.death = true) {
      System.out.println(this + " is already dead..why would you fight him??");
    } else if (opp.death = true) {
      System.out.println(opp + " is already dead..why would you fight him??");
    } else if (chance == 1) {
      System.out.println(this + " won");
      opp.passedout = true;
    } else if (chance == 2) {
      System.out.println(opp  + " won");
      this.passedout = true;
    } else {
      System.out.println("Both passed out");
      opp.passedout = true;
      this.passedout = true;
    }
  }

  public void parrot () {
    System.out.println("I am a parrot, squak, squak");
  }

  public void pirateHealth() {
    if (passedout == true) {
      System.out.println("ZZZZZzzzzz");
    } else if (death == true) {
      System.out.println("kkhkhhhggggaaaargh");
    } else howsItGoingMate();
  }

  public void clearStatus() {
    switch (whatToDo()) {
      case "r":
        this.death = false;
         System.out.println("Your pirate has been reviveth");
         break;

      case "w":
        this.passedout = false;
        System.out.println("Your pirate is awake now. Pour him anudder!!");
        break;
      }
  }

  public static String whatToDo() {
    Scanner myScanner = new Scanner(System.in);

    System.out.println("What would you like to do with your filthy pirate?");
    System.out.println("To revive, enter [r]");
    System.out.println("To wake him up, enter [w]");

    return myScanner.nextLine();
  }

}
