package abstractexample;

abstract class ConceptualClass {
    private ConceptualClass() {

    }

    protected ConceptualClass(String s1) {
        printSomething(s1);
    }

    public abstract void printSomething(String something);
}

class RealClass extends ConceptualClass {

    public RealClass() {
        super("");
    }

    public RealClass(String s1, String s2) {
        super("");
    }

    @Override
    public void printSomething(String something) {
        System.out.println("Printing " + something + " Real");
    }
}

public class AbstractClassExample2 {
    public static void main(String[] args) {
        RealClass r = new RealClass();
        r.printSomething("BIG SOMETHING");
    }
}
