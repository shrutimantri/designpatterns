package creational.abstractfactory;

public class SportsCarEngineFactory implements AbstractEngineFactory {

    @Override
    public VehicleEngine getEngine(String brand) {
        return switch (brand) {
            case "Audi" -> new AudiSportsEngine();
            case "Mercedes" -> new MercedesSportsEngine();
            default -> null;
        };
    }

}
