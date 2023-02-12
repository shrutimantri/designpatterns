package creational.abstractfactory;

public class TestAbstractFactory {

    public static void main(String[] args) {
        AbstractEngineFactory factory = EngineFactoryProducer.getFactory(false);
        VehicleEngine audiEngine = factory.getEngine("Audi");
        System.out.println(audiEngine.getInformation());

        factory = EngineFactoryProducer.getFactory(true);
        VehicleEngine mercedesSportsEngine = factory.getEngine("Mercedes");
        System.out.println(mercedesSportsEngine.getInformation());
    }

}
