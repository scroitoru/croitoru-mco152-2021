package croitoru.scrabble;

import java.io.File;
import java.util.*;

//Program to search if a word is present in the dictionary or not
public class Scrabble {
    public boolean wordPresent(String word) {
        try {
            Scanner sc = new Scanner(new File("dictionary.txt"));
            while (sc.hasNext()) {
                String currWord = sc.next();
                if (currWord.equals(word))
                    return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}