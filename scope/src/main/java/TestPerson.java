public class TestPerson {

    public static void main(String[] args) {
        Person joe = new Person("JOE", "55");
        Person deb = new Person("DEB", "85");
        Person ann = new Person("100");
        Person rich = new Person("RICH", "20");

        System.out.println(joe);
        System.out.println(deb);
        System.out.println("--- ANN BEFORE ---");
        System.out.println(ann);
        ann.setAge("21");
        ann.setInstanceName("ANN");
        System.out.println("--- ANN AFTER ---");
        System.out.println(ann);
        System.out.println(rich);
    }
}
