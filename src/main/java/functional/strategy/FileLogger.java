package functional.strategy;

public class FileLogger implements Logger {

    @Override
    public void log(String text) {
        System.out.println("Logging this log into file: " + text);
    }

}
