package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {

    private static Map<String, Vehicle> vehicles = new HashMap<>();

    private VehicleFactory() {
    }

    public static Vehicle getVehicle(String color) {
        return vehicles.computeIfAbsent(color, newColor -> {
            Engine newEngine = new Engine();
            return new Car(newEngine, newColor);
        });
    }

}
