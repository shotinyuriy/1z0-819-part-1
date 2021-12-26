package transport;

public abstract class AutomatedVehicle extends Vehicle {

    public AutomatedVehicle(VehicleType type, String owner, String make) {
        super(type, owner, make);
    }

    @Override
    public void drive() {
        autoDrive();
    }

    @Override
    public void park() {
        autoPark();
    }

    abstract void autoDrive();
    abstract void autoPark();
}
