package structural.flyweight;

public class TestFlyweightPattern {

    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicle("Black");
        vehicle.start();
        vehicle.stop();
        System.out.println("Vehicle color is: " + vehicle.getColor());
        vehicle = VehicleFactory.getVehicle("Black");
        vehicle.start();
        vehicle.stop();
        System.out.println("Vehicle color is: " + vehicle.getColor());
    }

}
