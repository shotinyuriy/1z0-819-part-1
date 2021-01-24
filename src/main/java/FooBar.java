public class FooBar {
    public static void main(String[] args) {
        int p;

        boolean myBoolean = true;
        if (myBoolean) {
            p = 1;
        } else {
            p = 2;
        }
        System.out.println("p is " + p);

        int q;
        if (true) {
            q = 1;
        }
        System.out.println("q is " + q);

        int testInt = 5;
        int r;
        switch (testInt) {
            case 0:
            case 1:
            case 2:
                r = 1;
                break;
            case 3:
            case 4:
            case 5:
                r = 2;
                break;
            default:
                r = 3;
        }
        System.out.println("r is " + r);

        int s, t = 0;
        do {
            s = t++;
        } while (t < 1);
        System.out.println("s is " + s);

        int u, v = 0;
        while(Math.PI > 0) {
            u = v++;
            break;
        }
        System.out.println("u is "+u);
    }
}