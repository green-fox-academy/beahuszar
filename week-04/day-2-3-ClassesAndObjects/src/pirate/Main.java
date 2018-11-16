package pirate;

public class Main {
  private static String jack = "Jack";
  private static String davyJones = "Davy Jones";

  public static void main(String[] args) {
    public Pirate jack = new Pirate(2);
    Pirate davyJones = new Pirate(3);
    Pirate parrot = new Pirate();
    jack.drinkSomeRum();
    davyJones.die(davyJones);
    davyJones.howsItGoingMate(davyJones);
    jack.brawl(jack,davyJones);
    parrot.parrot();

  }
}
