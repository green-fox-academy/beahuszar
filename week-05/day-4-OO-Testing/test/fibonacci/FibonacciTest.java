package fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

  @Test
  void fibonacci() {
    Fibonacci fibo = new Fibonacci();
    assertEquals(6765,fibo.fibonacci(20));
    assertEquals(4181,fibo.fibonacci(19));
    assertEquals(2584,fibo.fibonacci(18));
    assertEquals(1597,fibo.fibonacci(17));
    assertEquals(987,fibo.fibonacci(16));
    assertEquals(610,fibo.fibonacci(15));
  }
}
