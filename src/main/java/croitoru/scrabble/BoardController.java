package croitoru.scrabble;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.io.FileNotFoundException;
import java.util.List;

public class BoardController {

    @FXML
    List<Label> answerLabels;
    @FXML
    List<Label> letterButtons;

    private LetterBag letterBag = new LetterBag();

    private ScrabbleDictionary dictionary;

    public BoardController(){
        try{
            dictionary = new ScrabbleDictionary();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }

    @FXML
    public void initialize(){
        for (Label label : letterButtons){
            label.setText(letterBag.nextLetter());
        }
    }

    public void onAnswerClicked(MouseEvent event) {
        Label label = (Label) event.getSource();
    }

    public void onLetterClicked(MouseEvent event) {
    }

    public void onClear(ActionEvent event) {
    }

    public void onSubmit(ActionEvent event) {
    }
}
