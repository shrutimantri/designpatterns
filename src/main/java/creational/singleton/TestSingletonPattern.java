package creational.singleton;

public class TestSingletonPattern {

    public static void main(String[] args) {
        // only way of instantiating class
        DatabaseDriver databaseDriver = DatabaseDriver.getInstance();
    }

}
