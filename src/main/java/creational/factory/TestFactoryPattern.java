package creational.factory;

public class TestFactoryPattern {

    public static void main(String[] args) {
        EngineFactory factory = new AudiEngineFactory();
        factory.printEngineInformation();

        factory = new MercedesEngineFactory();
        factory.printEngineInformation();
    }

}
