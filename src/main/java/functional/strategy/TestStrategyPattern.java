package functional.strategy;

public class TestStrategyPattern {

    public static void main(String[] args) {
        Logger logger = new FileLogger();
        TestClass testClass = new TestClass(logger);
        testClass.log("Logging this in file");
        logger = new ConsoleLogger();
        testClass = new TestClass(logger);
        testClass.log("Logging this on console");
    }

}
