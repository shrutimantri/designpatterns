package functional.strategy;

public class TestClass {

    private Logger logger;

    public TestClass(Logger logger) {
        this.logger = logger;
    }

    public void log(String text) {
        logger.log(text);
    }

}
