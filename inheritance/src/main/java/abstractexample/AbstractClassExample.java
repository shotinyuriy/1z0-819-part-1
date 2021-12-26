package abstractexample;

abstract class AbstractExample {
    public static final String ABSTRACT_CONSTANT = "Abstract";

    public static final void staticFinalMethod() {
        System.out.println("static final method is ok in abstract class");
        System.out.println("my constant is " + ABSTRACT_CONSTANT);
    }

    public final void finalMethod() {
        System.out.println("final method is ok in abstract class");
        System.out.println(doThis() + " and " + doThat());
    }

    abstract String doThis();

    abstract String doThat();
}

class ConcreteExample extends AbstractExample {
    String doThis() {
        return "I do this";
    }

    String doThat() {
        return "I do that";
    }
}

public class AbstractClassExample {
    public static void main(String[] main) {
        ConcreteExample.staticFinalMethod();
        ConcreteExample c = new ConcreteExample();
        c.finalMethod();
    }
}
