package structural.flyweight;

public class VehicleFactory {

    private VehicleFactory() {
    }

    public static Vehicle getVehicle(String color) {
        Engine newEngine = new Engine();
        return new Car(newEngine, color);
    }

}
