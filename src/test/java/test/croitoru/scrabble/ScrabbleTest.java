package test.croitoru.scrabble;

import croitoru.scrabble.Scrabble;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class ScrabbleTest {
    @Test
    public void ifWordThere() throws FileNotFoundException {
        //given
        Scrabble search = new Scrabble();

        //when

        //then
        assertTrue(search.wordPresent("and"));
    }

    @Test
    public void ifWordNotThere() throws FileNotFoundException{
        //given
        Scrabble search = new Scrabble();

        //when

        //then
        assertFalse(search.wordPresent("snh"));
    }

    @Test
    public void getDefinition() throws FileNotFoundException{
        //given
        Scrabble search = new Scrabble();

        //when

        //then
        assertEquals("in the company of [prep]", search.getDefinition("with"));
    }

}
