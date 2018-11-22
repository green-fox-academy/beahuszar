package apples;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplesTest {

 /* Apples apple;

  @BeforeAll
  public void initialize() {
    apple = new Apples();
  }*/

  @Test
  void getApple() {
    Apples apple = new Apples();
    assertEquals("Apples", apple.getApple());
  }
}
