package sb;

import java.util.stream.Stream;

public class StringBuilderCreation {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder(); // 16

        StringBuilder sb2 = new StringBuilder("12345"); // String.length() + 16

        StringBuilder sb3 = new StringBuilder(30); //

        StringBuilder sb4 = new StringBuilder(sb2);

        Stream.of(sb1, sb2, sb3, sb4)
                .forEach(sb -> {
                    System.out.println("capacity = " + sb.capacity() + " length = "  + sb.length());
                });

        System.out.println("sb2 == sb4 = " + (sb2 == sb4));
        System.out.println("sb2 equals sb4 = " + sb2.equals(sb4));
        System.out.println("sb2 compareTo sb4 = " + sb2.compareTo(sb4));
        System.out.println("sb2.toString() == sb4.toString() = " + sb2.toString() == sb4.toString());
        System.out.println("sb2.toString() equals sb4.toString() = " + sb2.toString().equals(sb4.toString()));

    }
}
