package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextSearch {
    public static void main(String[] args) {
        String fullText = "testwordtestwordtestwordtestword";
        String showIndx = "012345678901234567890123";

        String searchString = "word";

        int lastIndex = fullText.lastIndexOf(searchString);
        System.out.println("lastIndex = " + lastIndex);

        lastIndex = fullText.lastIndexOf(searchString, 19);
        System.out.println("and now the lastIndex = " + lastIndex);

        lastIndex = fullText.lastIndexOf(searchString, 15);
        System.out.println("and now the lastIndex = " + lastIndex);

        String mississippi = "mississippi";
        boolean matches = mississippi.matches("(.*)miss(.*)");
        System.out.println("matches method returns " + matches + " on '(.*)miss(.*)'");

        Pattern p = Pattern.compile("(.*)miss(.*)");
        Matcher m = p.matcher("mississippi");
        System.out.println("Pattern & Matcher give the same result, matches on '(.*)miss(.*)' = " + m.matches());

        System.out.println("regionMatches('issi') = "+mississippi.regionMatches(1, "issi", 0, 4));
        System.out.println("ignore case regionMatches('IsSi') = "+mississippi.regionMatches(true, 1, "IsSi", 0, 4));
    }
}
