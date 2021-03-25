package string;

public class StringComparison {

    public static void main(String[] args) {
        String nullString = null;
        String hello = "Hello";
        String secondString = "hello";
        Object secondObject = secondString;
        CharSequence secondSequence = secondString;

        System.out.println("equals = " + hello.equals(secondSequence));
        System.out.println("compareTo = " + hello.compareTo(secondString));

        // string s1 is substring
    }
}
