package transport;

public class AutomatedAuto extends AutomatedVehicle {
    public AutomatedAuto(VehicleType type, String owner, String make) {
        super(type, owner, make);
    }

    @Override
    void autoDrive() {
        System.out.println("Driving by myself");
    }

    @Override
    void autoPark() {
        System.out.println("Parking by myself");
    }

    @Override
    public void makeNoise() {
        System.out.println("Beep Beep");
    }

    public static void main(String[] args) {
        Vehicle automatedCar = new AutomatedAuto(VehicleType.Automobile, "Martha", "Tesla");
        System.out.println(automatedCar);
        automatedCar.drive();
        automatedCar.park();
        automatedCar.makeNoise();
    }
}
