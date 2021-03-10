package test.croitoru.scrabble;

import croitoru.scrabble.ScrabbleDictionary;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class ScrabbleTest {
    @Test
    public void ifWordThere() throws FileNotFoundException {
        //given
        ScrabbleDictionary search = new ScrabbleDictionary();

        //when

        //then
        assertTrue(search.wordPresent("and"));
    }

    @Test
    public void ifWordNotThere() throws FileNotFoundException{
        //given
        ScrabbleDictionary search = new ScrabbleDictionary();

        //when

        //then
        assertFalse(search.wordPresent("snh"));
    }

    @Test
    public void getDefinition() throws FileNotFoundException{
        //given
        ScrabbleDictionary search = new ScrabbleDictionary();

        //when

        //then
        assertEquals("in the company of [prep]", search.getDefinition("with"));
    }

}
