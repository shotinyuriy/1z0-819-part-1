package z0.part;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        int i = 1234567890;
        float f = i;

        System.out.println(i);
        System.out.println(f);
        System.out.println(i-(int)f);
    }
}
