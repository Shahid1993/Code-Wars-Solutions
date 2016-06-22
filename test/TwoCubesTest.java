/**
 * Created by ajinkyakolhe on 6/22/2016.
 */

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoCubesTest {

    @Test
    public void test1() {
        assertEquals(false, TwoCubes.hasTwoCubeSums(1));
    }

    @Test
    public void test2() {
        assertEquals(true, TwoCubes.hasTwoCubeSums(1729));
    }

    @Test
    public void test3() {
        assertEquals(false, TwoCubes.hasTwoCubeSums(42));
    }

    @Test
    public void test4() {
        assertEquals(true, TwoCubes.hasTwoCubeSums(4104));
    }

    @Test
    public void test5() {
        assertEquals(false, TwoCubes.hasTwoCubeSums(4105));
    }
}
