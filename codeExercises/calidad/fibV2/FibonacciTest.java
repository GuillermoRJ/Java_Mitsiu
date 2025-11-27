import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class FibonacciTests {

    private final Fibonacci fib = new Fibonacci();

    @Test
    void arrayCinco() {
        int[] serie = fib.generateFibSerie(5);

        int[] expected = {1,1,2,3,5};
        assertArrayEquals(expected, serie);
    }

    @Test
    void arrayUno() {
      int[] got = fib.generateFibSerie(1);
      int [] expected = new int[0];
      assertArrayEquals(expected, got);
    }

}


