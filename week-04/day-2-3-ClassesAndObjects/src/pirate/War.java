package pirate;

public class War {
  public static void main(String[] args) {
    Armada spanishArmada = new Armada();
    Armada dutchArmada = new Armada();

    dutchArmada.recruitArmada();
    spanishArmada.recruitArmada();


    spanishArmada.war(dutchArmada);


  }
}
