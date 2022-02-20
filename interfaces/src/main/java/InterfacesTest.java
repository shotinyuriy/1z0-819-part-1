interface InterfacesExample {
    public static final String ANY_FIELD = "ANY_VALUE";

    private String privateMethod() {
        return "private";
    }

    private static String privateStaticMethod() {
        return "private static";
    }

    static String publicStaticMethod() {
        return "public static";
    }

    default String defaultMethod() {
        return String.join(" and ", privateMethod(), privateStaticMethod(), publicStaticMethod(),"then default");
    }


}

public class InterfacesTest {
    public static void main(String[] args) {
        InterfacesExample example = new InterfacesExample() {};
        System.out.println(example.defaultMethod());
    }
}
