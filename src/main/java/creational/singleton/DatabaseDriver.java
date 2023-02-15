package creational.singleton;

public class DatabaseDriver {

    private static DatabaseDriver databaseDriver = null;

    // private constructor, so that can't be instantiated from outside.
    private DatabaseDriver() {

    }

    public static DatabaseDriver getInstance() {
        if (databaseDriver == null) {
            databaseDriver = new DatabaseDriver();
        }

        return databaseDriver;
    }

}
