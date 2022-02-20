interface Extendable {
    default void defaultMethod() {
        System.out.println("Extendable: Default method called.");
    }

    void extend();
}

interface SubExtendable extends Extendable {
    void append();
}

class Instance implements SubExtendable {
    @Override
    public void extend() {
        defaultMethod();
        System.out.println("Overridden extend() method");
    }

    @Override
    public void append() {
        defaultMethod();
        System.out.println("Overridden append() method");
    }
}

public class ExtendInterfaceExample {

    public static void main(String... args) {
        Extendable e = new Instance();
        e.extend();
    }
}
