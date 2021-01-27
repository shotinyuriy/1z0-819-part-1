public class NestedScope {
    public static void main(String[] args) {
        int i = 10;
        class locallyDefinedClass {
            {
                System.out.println("value of i BEFORE LOOP " + i);
                System.out.println("----------");

                for (int i = 0; i < 5; i++) {
                    System.out.println("value of i during FIRST loop " + i);
                }
                System.out.println("----------");

                for (int i = 5; i > 0; i--) {
                    System.out.println("value of i during SECOND loop " + i);
                }
                System.out.println("----------");

                for(int j = i; j < 15; j++) {
                    System.out.println("value of j during THIRD loop " + j);
                    System.out.println("value of i during THIRD loop " + i);
                }
            }
        }
        new locallyDefinedClass();
        System.out.println("value of i after local class instantiated");
    }
}
