package op;

public class UnaryOperator {
    public static void main(String[] args) {
        int a = 0;
        a = 1;
        ++a;
        System.out.println("a after ++a = " + a);
        a = 1;
        a++;
        System.out.println("a after a++ = " + a++);
        System.out.println("and now the value of a is " + a);

        int c = 1, d = -a;

        int zero = 0, unzero = ~0;
        int one = 1, unone = ~1;
        System.out.println("zero = "+ zero+" unzero = "+unzero);
        System.out.println("one = "+ one+" unone = "+unone);

        int x = 1;
        System.out.println("1 + x++ = "+ (1+x++));
        x = 1;
        System.out.println("1 + (x++) = "+ (1+(x++)));

        x = 1;
        System.out.println("1 + (x++) + x = "+ (1+(x++) + x));

        int e = -8 << 1; // 10000000_00001000 << 1 = 00010000 = -16
        int f = -8 >> 1; // 10000000_00001000 >> 1 = 00000100 = -4
        int g = -8 >>> 1; // Integer.MAX -
        System.out.printf("e=%d f=%d g=%d\n",e, f, g );

        System.out.printf("2|2=%d\n", (2|2)); // 0010 | 0010 = 0010
        System.out.printf("2|3=%d\n", (2|3)); // 0010 | 0011 = 0011

        System.out.printf("2&2=%d\n", (2&2)); // 0010 & 0010 = 0010
        System.out.printf("2&3=%d\n", (2&3)); // 0010 & 0011 = 0010

        System.out.printf("2^2=%d\n", (2^2)); // 0010 ^ 0010 = 0010
        System.out.printf("2^3=%d\n", (2^3)); // 0010 ^ 0011 = 0001
    }
}
