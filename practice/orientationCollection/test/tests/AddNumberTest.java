package tests;

import com.sun.javaws.exceptions.InvalidArgumentException;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddNumberTest {
  AddNumber add = new AddNumber();

  @Test
  public void addNum() {
    assertEquals(5,add.addNum(2,3));
  }

  @Test (expected = ArithmeticException.class)
  public void division() {
    add.division(2,0);
  }
}
