package sum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class SumTest {
  Sum sum;
  ArrayList<Integer> testArray;
  ArrayList<Integer> emptyArray2;
  ArrayList<Integer> oneElementArray;

  @BeforeEach
  public void initialize() {
    sum = new Sum();
    testArray = new ArrayList<>();
    emptyArray2 = new ArrayList<>();
    oneElementArray = new ArrayList<>();
    testArray.add(1);
    testArray.add(2);
    testArray.add(3);
    testArray.add(4);
    oneElementArray.add(4);
  }

  @Test
  public void sum() {
    assertEquals(10,sum.sum(testArray));
  }

  @Test
  public void sumEmpty() {
    assertEquals(0,sum.sum(emptyArray2));
  }

  @Test
  public void sumOneElement() {
    assertEquals(4,sum.sum(oneElementArray));
  }

  @Test (expected=Exception.class)
  public void sumNull() {
    sum.sum(null);
  }
}
