package functional.strategy;

public class ConsoleLogger implements Logger {

    @Override
    public void log(String text) {
        System.out.println("Logging this log into console: " + text);
    }

}
