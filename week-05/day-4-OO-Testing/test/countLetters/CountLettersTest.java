package countLetters;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
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
  }

  @Test
  public void createDictionary() {
    testMap = cl.createDictionary(input);
    assertThat(testMap.size(), is(6));
  }

  @Test
  public void testDictionary() {
    testMap = cl.createDictionary(input);
    assertEquals((int)testMap.get('a'), 3);
  }


}
