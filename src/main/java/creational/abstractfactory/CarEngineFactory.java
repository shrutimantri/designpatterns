package creational.abstractfactory;

public class CarEngineFactory implements AbstractEngineFactory {

    @Override
    public VehicleEngine getEngine(String brand) {
        return switch (brand) {
            case "Audi" -> new AudiEngine();
            case "Mercedes" -> new MercedesEngine();
            default -> null;
        };
    }

}
