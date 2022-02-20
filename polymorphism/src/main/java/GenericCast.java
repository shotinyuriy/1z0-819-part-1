import java.util.ArrayList;
import java.util.List;

public class GenericCast {
    static class BaseClass {
        String name = "Base Case";
        public String toString() {
            return getClass().getName();
        }
    }

    static class NextClass extends BaseClass {
        String name = "Next Best Case";
        public static void testId() {
            System.out.println("Next Class Test It");
        }
        public String toString() {
            return getClass().getName();
        }
    }

    public static void main(String[] args) {
        ArrayList rawList = new ArrayList();
        List aList;
        aList = rawList;
        ArrayList<BaseClass> baseList = new ArrayList<>();
        List<BaseClass> bList;
        bList = baseList;

        rawList.add(new NextClass());

        rawList.add(new StringBuilder("Hello"));

        // baseList.add(new StringBuilder("Hello"));

        Object t = new BaseClass();
        Object s = new NextClass();
        System.out.println(getClassyName(t));
        System.out.println(getClassyName(s));
    }

    public static String getClassyName(Object o) {
        return  ((BaseClass)o).getClass().getName();
    }

    public static String getClassyName(NextClass n) {
        return n.getClass().getName();
    }
}
