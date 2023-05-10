import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WordReverserTest {
    @Test
    public void testReverse1() {
        WordReverser reverser = new WordReverser();
        assertEquals("siht si a tset htiw tinuj tset krowemarf", reverser.reverse("this is a test with junit test framework"));
    }

    @Test 
    public void testEmptyString() {
        WordReverser reverser = new WordReverser();
        assertEquals("", reverser.reverse(""));        
    }


    @Test 
    public void testOneWord() {
        WordReverser reverser = new WordReverser();
        assertEquals("avaj", reverser.reverse("java"));        
    }
    @Test 
    public void testHelloWorld() {
        WordReverser reverser = new WordReverser();
        assertEquals("olleH !dlrow", reverser.reverse("Hello world!"));        
    }
}
