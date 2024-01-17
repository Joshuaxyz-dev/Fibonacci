import org.junit.*;

public class FibTest {
    Fib fib;
    int[] expectFibonacciSeries = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
    @Before
    public void setUpInstance() {
        fib = new Fib();
    }

    @Test
    public void testGenerateFibonacciSeries() {

        for (int i = 0; i < expectFibonacciSeries.length; i++) {
            Assert.assertTrue(String.valueOf(expectFibonacciSeries[i]), fib.expectedFibonacciSeries(55));
        }
    }
}