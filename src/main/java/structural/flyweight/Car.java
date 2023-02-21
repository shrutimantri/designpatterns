package structural.flyweight;

public class Car implements Vehicle {

    private Engine engine;
    private String color;

    public Car(Engine engine, String color) {
        System.out.println("Creating new car...");
        this.engine = engine;
        this.color = color;
    }

    @Override
    public void start() {
        engine.start();
    }

    @Override
    public void stop() {
        engine.stop();
    }

    @Override
    public String getColor() {
        return color;
    }

}
