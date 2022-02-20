interface Laughable {
    void laugh();
}
class Story {
    public void read() {
        System.out.println("Reading a story");
    }
}

public class InterfaceCast {
    Laughable l = (Laughable) new Story();

}
