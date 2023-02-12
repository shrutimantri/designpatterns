package creational.abstractfactory;

public class EngineFactoryProducer {

    public static AbstractEngineFactory getFactory(boolean isSportsVariant) {
        if(isSportsVariant) {
            return new SportsCarEngineFactory();
        }

        return new CarEngineFactory();
    }

}
