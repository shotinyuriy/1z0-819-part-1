package string;

public class StringCount {
    public static void main(String[] args) {
        String originalStr = "original string";
        String replacedStr = originalStr.replace("CC", "aa");
        System.out.println("1. replacedStr == originalStr = " + (replacedStr == originalStr));

        replacedStr = originalStr.replace('a', 'a');
        System.out.println("2. replacedStr == originalStr = " + (replacedStr == originalStr));

        replacedStr = originalStr.replace("a", "a");
        System.out.println("3. replacedStr == originalStr = " + (replacedStr == originalStr));

        replacedStr = originalStr.replaceAll("a", "a");
        System.out.println("4. replacedStr == originalStr = " + (replacedStr == originalStr));

        replacedStr = originalStr.substring(0, originalStr.length());
        System.out.println("5. replacedStr == originalStr = " + (replacedStr == originalStr));

        String s1 = "abc" + ":" + "def";
        String s2 = "s2";
        String s3 = "s3";
        String s4 = "s4";

        String s5 = (((s1 + s2) + s3) + s4);

    }
}
