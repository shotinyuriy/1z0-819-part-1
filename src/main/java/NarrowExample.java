public class NarrowExample {
    public static void main(String[] args) {
        System.out.println("A byte has a range of " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("A char has a range of " + String.format("\\u%04x to \\u%04x", (int) Character.MIN_VALUE, (int) Character.MAX_VALUE));
        System.out.println("A short has a range of " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);
        System.out.println("A short has a range of " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("An int has a range of " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("A long has a range of " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);

        System.out.println("A float has a range of " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("A double has a range of " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);

        byte b = 127;
        char c = 65535;
        short s = 32767;

//        float f2 = 0.0;
//        byte b2 = 0.0;
//        char c2 = 0.0;
        int myIntVariable = 1;
//        byte b2 = myIntVariable;
//        char c2 = myIntVariable;
//        short s2 = myIntVariable;
    }
}
