public class Bar {
    static byte staticBarByte;
    static char staticBarChar;
    static short staticBarShort;
    static int staticBarInt;
    static long staticBarLong;
    static float staticBarFloat;
    static double staticBarDouble;
    static boolean staticBarBoolean;

    byte barByte;
    char barChar;
    short barShort;
    int barInt;
    long barLong;
    float barFloat;
    double barDouble;
    boolean barBoolean;

    public static void main(String[] args) {
        System.out.println("static bar");
        System.out.println(staticBarByte);
        System.out.println(staticBarChar);
        System.out.println("char = "+(int)staticBarChar);
        System.out.println(staticBarShort);
        System.out.println(staticBarInt);
        System.out.println(staticBarLong);
        System.out.println(staticBarFloat);
        System.out.println(staticBarDouble);
        System.out.println(staticBarBoolean);

        System.out.println("\n\nbar");
        Bar bar = new Bar();
        System.out.println(bar.barByte);
        System.out.println(bar.barChar);
        System.out.println(bar.barShort);
        System.out.println(bar.barInt);
        System.out.println(bar.barLong);
        System.out.println(bar.barFloat);
        System.out.println(bar.barDouble);
        System.out.println(bar.barBoolean);
    }
}
