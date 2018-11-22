package sharpie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SharpieTest {

  @Test
  void use() {
    Sharpie sharpie = new Sharpie("Black",12);
    sharpie.use();
    assertEquals(99,sharpie.inkAmount);
    assertEquals("Black",sharpie.color);
    assertEquals(12,sharpie.width);
  }
}
