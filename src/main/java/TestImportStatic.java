import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

import static java.lang.Math.*;

public class TestImportStatic {
    public static void main(String[] args) {
        int radius = 2;
        double circumference = 2 * PI * radius;
        System.out.println("circumference = " + circumference);

        double sqrt81 = sqrt(81);
        System.out.println("sqrt81 = " + sqrt81);
    }
}
