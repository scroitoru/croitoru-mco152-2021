package test.croitoru.scrabble;

import croitoru.scrabble.Scrabble;
import org.junit.Test;

import static org.junit.Assert.*;

public class ScrabbleTest {
    @Test
    public void ifWordThere(){
        Scrabble search = new Scrabble();
        assertTrue(search.wordPresent("and"));
    }

    @Test
    public void ifWordNotThere(){
        Scrabble search = new Scrabble();
        assertFalse(search.wordPresent("snh"));
    }
}
