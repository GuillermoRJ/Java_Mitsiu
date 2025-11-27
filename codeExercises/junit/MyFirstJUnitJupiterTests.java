import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyFirstJUnitJupiterTests {

  //private final Calculator calculator = new Calculator();

  @Test
  void addition() {
    int[] expect = {1,1,2,3,5};
    assertArrayEquals(expect, Fibonacci.generateFibSerie(5));
  }

}


