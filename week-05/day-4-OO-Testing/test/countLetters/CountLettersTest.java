package countLetters;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class CountLettersTest {
  String input;
  HashMap<Character,Integer> testMap;
  CountLetters cl;

  @BeforeEach
  public void initialize() {
    input = "karalabe";
    cl = new CountLetters();
    testMap = cl.createDictionary(input);
  }

  @Test
  public void testMapSize() {
    assertThat(testMap.size(), is(6));
  }

  @Test
  public void testDuplicateChar() {
    assertEquals(3, (int)testMap.get('a'));
  }


}
