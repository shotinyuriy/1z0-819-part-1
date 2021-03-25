package sb;

import java.util.Date;

public class StringBuilderAppendInsert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(11);
        sb.append("Hello ");
        stat(sb);
        sb.append(new char[]{'W', 'o', 'r', 'l', 'd'});
        stat(sb);
        sb.append(',');
        stat(sb);
        sb.append("...Today is:...", 3, 9);
        stat(sb);
        sb.append(new Date());
        stat(sb);
        sb.append(" is ");
        stat(sb);
        sb.appendCodePoint(97);
        stat(sb);
        sb.append(" float with the value of: ");
        stat(sb);
        sb.append(204.50f);
        System.out.println("sb = " + sb);

        sb = new StringBuilder(13);
        sb.insert(0, "Hello, is a float with the value of");
        stat(sb);
        sb.insert(5, new char[]{'W', 'o', 'r', 'l', 'd'});
        stat(sb);
        sb.insert(13, new Date());
        stat(sb);
        System.out.println("sb = " + sb);
    }

    private static void stat(StringBuilder sb) {
        System.out.println("sb.capacity = " + sb.capacity() + " sb.length = " + sb.length());
    }
}
