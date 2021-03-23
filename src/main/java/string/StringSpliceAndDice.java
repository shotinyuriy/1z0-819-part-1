package string;

import java.util.Arrays;
import java.util.StringJoiner;

public class StringSpliceAndDice {
    public static void main(String[] args) {
        String[] wordArray = {"I", "am", "tired", "and", "I", "had", "better", "go", "to", "sleep"};
        StringJoiner sj = new StringJoiner(" |");
        for (String word : wordArray) {
            sj.add(word);
        }
        String sentence = sj.toString();
        System.out.println("sentence = " + sentence);

        String[] splitWords = sentence.split("\\|");
        System.out.println("splitWords = " + Arrays.toString(splitWords));
    }
}
