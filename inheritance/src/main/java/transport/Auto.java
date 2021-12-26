package transport;

public class Auto extends Vehicle {
    public Auto(VehicleType type, String owner, String make) {
        super(type, owner, make);
    }

    @Override
    public void drive() {
        System.out.println("Release Brake, go");
    }

    @Override
    public void park() {
        System.out.println("Parallel or Back in?");
    }

    @Override
    public void makeNoise() {
        System.out.println("Vroom Vroom");
    }



    public static void main(String[] args) {
        Auto car = new Auto(VehicleType.Automobile, "Allen", "Ford");
        System.out.println(car);
        car.drive();
        car.park();
        car.makeNoise();
    }
}
