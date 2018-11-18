package pirate;

public class Main {
  private static String jack = "Jack";
  private static String davyJones = "Davy Jones";

  public static void main(String[] args) {
    Ship blackpearl = new Ship();
    blackpearl.fillship();
    Ship titanic = new Ship();
    titanic.fillship();

    blackpearl.battle(titanic);

  }
}
