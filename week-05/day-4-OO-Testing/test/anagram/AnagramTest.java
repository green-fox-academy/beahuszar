package anagram;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnagramTest {
  Anagram anagram;

  @BeforeEach

  public void init() {
    anagram = new Anagram();
  }

  @Test
  public void isAnagram() {
    assertEquals(true,anagram.isAnagram("restful","fluster"));
  }
}
