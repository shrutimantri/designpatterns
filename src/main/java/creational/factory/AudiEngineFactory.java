package creational.factory;

public class AudiEngineFactory extends EngineFactory {

    @Override
    protected VehicleEngine getEngine() {
        return new AudiEngine();
    }

}
