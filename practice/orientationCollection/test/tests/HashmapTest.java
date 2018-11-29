package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class HashmapTest {

  String input;
  HashMap<Character,Integer> testMap;
  Hashmap cl;

  @BeforeEach // for initializing
  public void initialize() {
    input = "karalabe";
    cl = new Hashmap();
    testMap = cl.countLetters(input);
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
