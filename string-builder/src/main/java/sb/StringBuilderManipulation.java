package sb;

import java.util.Arrays;

public class StringBuilderManipulation {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        stat(sb);
        sb.append("World Hello, How are you?");
        stat(sb);

        sb.deleteCharAt(sb.indexOf(","));
        stat(sb);

        sb.delete(11, sb.length());
        stat(sb);

        sb.reverse();
        stat(sb);
        System.out.println("=== .trimToSize() ===");
        sb.trimToSize();
        stat(sb);

        StringBuilder rb = sb.reverse();
        stat(rb);
        stat(sb);

        String str = sb.substring(5);
        System.out.println("subString = " + str);

        sb.insert(0, "          [");
        sb.append("]                ");
        stat(sb);
        sb.replace(0, sb.length(), sb.toString().strip());
        stat(sb);

        sb.append("  just more text because we need more text.");

        char[] charArr1 = new char[10];
        char[] charArr2 = new char[10];

        sb.toString().getChars(20, 27, charArr1, 0);
        sb.getChars(20, 27, charArr2, 0);
        sb.getChars(27, 30, charArr2, 7);
        System.out.println("charArr1 = " + Arrays.toString(charArr1));
        System.out.println("charArr2 = " + Arrays.toString(charArr2));

        char[] charArr3 = new char[5];

        // sb.toString().getChars(20, 27, charArr3, 0); // java.lang.StringIndexOutOfBoundsException: offset 0, count 7, length 5
        // sb.getChars(20, 27, charArr3, 0); // java.lang.IndexOutOfBoundsException: start 0, end 7, length 5


        System.out.println("charArr3 = " + Arrays.toString(charArr2));


    }

    private static void stat(StringBuilder sb) {
        System.out.println("sb.capacity = " + sb.capacity() + " sb.length = " + sb.length() + " sb = " + sb+ ".");
    }
}
