import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;;

public class GraderTest {
    
    @Test
    public void zeroShouldBeF1() {
        Grader grader = new Grader();
        assertEquals("F1", grader.grade(0));
    }

    @Test
    public void foutyNineShouldBeF1() {
        Grader grader = new Grader();
        assertEquals("F1", grader.grade(49));
    }

    @Test
    public void fiftyShouldBeD2() {
        Grader grader = new Grader();
        assertEquals("D2", grader.grade(50));
    }

    @Test
    public void fiftyFourShouldBeD2() {
        Grader grader = new Grader();
        assertEquals("D2", grader.grade(54));
    }

    @Test
    public void fiftyFiveShouldBeD1() {
        Grader grader = new Grader();
        assertEquals("D1", grader.grade(55));
    }

    @Test
    public void fiftyNineShouldBeD1() {
        Grader grader = new Grader();
        assertEquals("D1", grader.grade(59));
    }

    @Test
    public void sixtyShouldBeC2() {
        Grader grader = new Grader();
        assertEquals("C2", grader.grade(60));
    }

    @Test
    public void ninetyNineShouldBeA1() {
        Grader grader = new Grader();
        assertEquals("A1", grader.grade(99));
    }

    @Test 
    public void hundredShouldBeA1() {
        Grader grader = new Grader();
        assertEquals("A1", grader.grade(100));
    }

    @Test
    public void negativeShouldThrowIllegalArgumentException() {
        Grader grader = new Grader();
        assertThrows(IllegalArgumentException.class, () -> {
            grader.grade(-1);
        });
    }

    @Test
    public void greaterThanHundredShouldThrowIllegalArgumentException() {
        Grader grader = new Grader();
        assertThrows(IllegalArgumentException.class, () -> {
            grader.grade(101);
        });
    }

}

