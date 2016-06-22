/**
 * Created by ajinkyakolhe on 6/22/2016.
 */

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciLastDigitTest {
    @Test
    public void example1() {
        assertEquals(FibonacciLastDigit.getFibNumb(193150), 5);
    }


    @Test
    public void example2() {
        assertEquals(FibonacciLastDigit.getFibNumb(300), 0);
    }

    @Test
    public void example3() {
        assertEquals(FibonacciLastDigit.getFibNumb(20001), 6);
    }

    // your custom test cases here...

}