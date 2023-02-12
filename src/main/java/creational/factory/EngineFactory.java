package creational.factory;

public abstract class EngineFactory {

    public void printEngineInformation() {
        VehicleEngine engine = getEngine();
        String engineInformation = engine.getInformation();
        System.out.println(engineInformation);
    }

    protected abstract VehicleEngine getEngine();

}
