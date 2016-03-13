/**
 * Created by ajinkya on 22/2/16.
 */
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class PipesTest {
    @Test
    public void tests() {
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9}, Pipes.pipeFix(new int[] {1,2,3,5,6,8,9}));
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10,11,12}, Pipes.pipeFix(new int[] {1,2,3,12}));
        assertArrayEquals(new int[] {6,7,8,9}, Pipes.pipeFix(new int[] {6,9}));
        assertArrayEquals(new int[] {-1,0,1,2,3,4}, Pipes.pipeFix(new int[] {-1,4}));
        assertArrayEquals(new int[] {1,2,3}, Pipes.pipeFix(new int[] {1,2,3}));
    }
}