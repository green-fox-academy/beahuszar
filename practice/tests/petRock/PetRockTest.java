package petRock;

import org.junit.Test;

import static org.junit.Assert.*;

public class PetRockTest {
  private PetRock rocky = new PetRock("Rocky");

  @org.junit.Test
  public void getName() throws Exception{
    assertEquals("Rocky",rocky.getName());
  }

  @Test
  public void testUnhappyToStart() throws Exception {
    assertFalse(rocky.isHappy());
  }

  @Test
  public void testHappyAfterPlay() {
    rocky.playWithRock();
    assertTrue(rocky.isHappy());
  }
}
