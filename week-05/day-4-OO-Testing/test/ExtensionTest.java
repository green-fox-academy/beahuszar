import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class ExtensionTest {
  Extension extension = new Extension();

  @Test
  void testAdd_2and3is5() {
    assertEquals(6, extension.add(3, 3));
  }

  @Test
  void testAdd_1and4is5() {
    assertEquals(7, extension.add(3, 4));
  }

  @Test
  void testMaxOfThree_first() {
    assertEquals(6, extension.maxOfThree(5, 4, 6));
  }

  @Test
  void testMaxOfThree_third() {
    assertEquals(4, extension.maxOfThree(3, 4, 3));
  }

  @Test
  void testMedian_four() {
    assertEquals(5, extension.median(Arrays.asList(7,5,3,5)));
  }

  @Test
  void testMedian_five() {
    assertEquals(3, extension.median(Arrays.asList(1,2,3,4,5)));
  }

  @Test
  void testIsVowel_a() {
    assertTrue(extension.isVowel('i'));
  }

  @Test
  void testIsVowel_u() {
    assertTrue(extension.isVowel('a'));
  }

  @Test
  void testTranslate_bemutatkozik() {
    assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
  }

  @Test
  void testTranslate_lagopus() {
    assertEquals("lavagovopuvus", extension.translate("lagopus"));
  }
}
