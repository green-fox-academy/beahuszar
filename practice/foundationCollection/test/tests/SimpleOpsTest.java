package tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleOpsTest {
  SimpleOps ani = new SimpleOps();

  @Test
  void eat() {
    ani.eat();
    assertEquals(49,ani.hunger);
  }

  @Test
  void drink() {
    ani.drink();
    assertEquals(49,ani.thirst);
  }

  @Test
  void play() {
    ani.play();
    assertEquals(51,ani.thirst);
    assertEquals(51,ani.hunger);
  }
}
