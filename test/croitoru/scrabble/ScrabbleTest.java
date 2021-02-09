package croitoru.scrabble;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScrabbleTest {
    @Test
    public void ifWordThere(){
        Scrabble search = new Scrabble();
        assertEquals(true, search.wordPresent("and"));
    }

    @Test
    public void ifWordNotThere(){
        Scrabble search = new Scrabble();
        assertEquals(false, search.wordPresent("snh"));
    }
}
