package test.croitoru.scrabble;

import croitoru.scrabble.LetterBag;
import croitoru.scrabble.ScrabbleBoardController;
import croitoru.scrabble.ScrabbleDictionary;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;

public class ScrabbleControllerTest {

    private LetterBag letterBag;
    private ScrabbleDictionary dictionary;
    private ScrabbleBoardController controller;
    private List<Label> answerLabels;
    private List<Button> letterButtons;
    private Label pointsLabel;

    @BeforeClass
    public static void beforeClass(){
        com.sun.javafx.application.PlatformImpl.startup(()->{});
    }

    @Test
    public void initialize(){
        //given
        givenScrabbleController();

        //when

        //then
    }

    private void givenScrabbleController() {
        letterBag = mock(LetterBag.class);
        dictionary = mock(ScrabbleDictionary.class);
        controller = new ScrabbleBoardController(dictionary, letterBag);
        letterButtons = Arrays.asList(
                mock(Button.class),
                mock(Button.class),
                mock(Button.class)
        );
    }
}
