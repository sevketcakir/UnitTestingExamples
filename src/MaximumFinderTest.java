import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class MaximumFinderTest {
    @Test
    public void positiveElementsTest() {
        MaximumFinder maximumFinder = new MaximumFinder();
        int[] array = new int[] {-3, 2, 1, 5, 4, 3, -5};
        assertEquals( 5, maximumFinder.findMax(array));
    }

    @Test
    public void negativeElementsTest() {
        MaximumFinder maximumFinder = new MaximumFinder();
        int[] array = new int[] {-3, -2, -1, -5, -4, -3, -5};
        assertEquals( -1, maximumFinder.findMax(array));
    }

    @Test 
    public void emptyArrayShouldThrowIndexOutOfBoundsException () {
        MaximumFinder maximumFinder = new MaximumFinder();
        int[] array = new int[] {};
        assertThrows(IndexOutOfBoundsException.class, () -> {
            maximumFinder.findMax(array);
        });
    }
}
