package creational.factory;

public class MercedesEngineFactory extends EngineFactory {

    @Override
    protected VehicleEngine getEngine() {
        return new MercedesEngine();
    }


}
