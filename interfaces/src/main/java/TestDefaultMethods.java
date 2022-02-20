interface Teachable {
    default void teachTheseLessons() {
        System.out.println("Everyone should learn art and music");
    }

    void teach();
}

interface Trainable {
    default void teachTheseLessons() {
        System.out.println("Train them to do this");
    }

    void train();
}

class Student implements Teachable, Trainable {
    @Override
    public void teachTheseLessons() {
        Teachable.super.teachTheseLessons();
    }

    public void teach() {
        teachTheseLessons();
        System.out.println("Teach a lesson");
    }

    public void train() {
        System.out.println("Train to do this");
    }
}

public class TestDefaultMethods {

    public static void main(String[] args) {
        Student s = new Student();
        s.teach();
        s.train();
    }
}
