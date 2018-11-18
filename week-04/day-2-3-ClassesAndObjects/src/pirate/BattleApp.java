package pirate;

public class BattleApp {
  public static void main(String[] args) {
    Ship blackpearl = new Ship();
    blackpearl.fillship();
    Ship titanic = new Ship();
    titanic.fillship();
    blackpearl.battle(titanic);
  }
}
