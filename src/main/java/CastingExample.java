public class CastingExample {
    public static void main(String[] args) {
        short s2;
        int loopIterations = 0;
        int minValue = Short.MIN_VALUE - 1;
        int maxValue = Short.MAX_VALUE + 1;

        for(int i = minValue; i <= maxValue; i++) {
            s2 = (short) i;
            if (i == minValue) System.out.println("Minimum short value = "+s2);
            if (i == maxValue) System.out.println("Maximum short value = "+s2);
            callAMethodWithParameter((loopIterations + 1), s2);
            loopIterations++;
        }
        System.out.println("loopIterations = "+loopIterations);
    }

    private static void callAMethodWithParameter(int i, short s) {
        if (s == Short.MAX_VALUE) System.out.println("Iteration "+i+" had the max value, my type is short");
    }
}
