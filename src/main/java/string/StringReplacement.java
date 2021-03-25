package string;

import java.util.ArrayList;
import java.util.Arrays;

public class StringReplacement {
    public static void main(String[] args) {
        String mississippi = "Mississippi";
        String[] resultArray = new String[4];

        resultArray[0] = mississippi.replace('i','a');
        resultArray[1] = mississippi.replace("iss","ech");
        resultArray[2] = mississippi.replaceAll("i\\w\\w", "ech");
        resultArray[3] = mississippi.replaceFirst("s", "d");

        System.out.println("resultArray = " + Arrays.toString(resultArray));

        String[] substrings = new String[4];

        substrings[0] = mississippi.substring(3);
        substrings[1] = mississippi.substring(3, 7);
        // substrings[2] = mississippi.substring(-7); // StringIndexOutOfBoundsException
        // substrings[3] = mississippi.substring(-7, 0); // StringIndexOutOfBoundsException
        substrings[2] = mississippi.substring(0);
        substrings[3] = mississippi.substring(0,mississippi.length());

        System.out.println("substrings = " + Arrays.toString(substrings));

        CharSequence subSequence = mississippi.subSequence(1, mississippi.length() - 1);
        System.out.println("subSequence = " + subSequence);
    }
}
