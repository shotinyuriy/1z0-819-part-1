public class Foo2 {
    public static void main(String[] args) {
        byte b = 127;
        char c = 127;
        short s = 127;
        int i = 127;
        long l = 127;
        double d = 127;

        boolean isTrue = false;

        System.out.printf("c = "+c);

        long l2 = 127l;
        long l3 = 127L;

        System.out.println("l2 = "+l2);
        System.out.println("l3 = "+l3);

        float f2 = 127f;
        float f3 = 127F;
        System.out.println("f2 = "+f2);
        System.out.println("f3 = "+f3);

        double d2 = 127d;
        double d3 = 127D;
        System.out.println("d2 = "+d2);
        System.out.println("d3 = "+d3);

        float f4 = 1.27e02f;
        double d4 = 1.27e02;
        System.out.println("f4 = "+f4);
        System.out.println("d4 = "+d4);

        byte b4 = 0b1111111;

        short s4 = 0177; // octal

        int i4 = 0x007F;

        byte b5 = 'a';
        char c5 = 'a';
        double d5 = 'a';

        System.out.println("b5 = "+b5);
        System.out.println("c5 = "+c5);
        System.out.println("d5 = "+d5);

        byte b6 = '\u007F';
        char c6 = '\u0033';

        byte b7 = 0b0000_0001;
        char c7 = 0x0_07F;
        short s7 = 011_11;
        int i7 = 1_000_000;
        float f7 = 1_000.000_000f;

        System.out.println("b6 = "+b6);
        System.out.println("c6 = "+c6);

//        byte b8 = 0b_00000001;
//        char c8 = 0x_007F;
//        int i8 = 1000000_;
//        long d8 = 1000000_L;
//        float f8 = _1000.00000;
//        double 1.000000_e10;
//        int i9 = null;
//        boolean b9 = null;
//        boolean b10 = 0;
    }
}
