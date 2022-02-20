interface Abstractable {
    public static String name = "Abstractable";
    default void makeConcrete() {
        method1();
    }
    private void method1() {
        System.out.println("method1");
    }
}

abstract class AbstractClass implements Abstractable {
    public static final String name = "ConcreteClass";
    abstract void callConcrete();
    protected abstract void doProtected();
}

class ConcreteClass extends AbstractClass {

    @Override
    public void makeConcrete() {
        super.makeConcrete();
        System.out.println(name);
    }

    @Override
    void callConcrete() {

    }

    @Override
    protected void doProtected() {

    }
}

interface Test {
    public static int counter = 0;

    private void doItPrivately() {
        System.out.println("A private method");
    }

    void doThat();

    default String doThat(String s) {
        return s;
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Abstractable a = new ConcreteClass();
        a.makeConcrete();
    }
}
