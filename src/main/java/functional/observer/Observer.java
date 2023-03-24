package functional.observer;

public interface Observer {

    void update(String description);

    void subscribe();

    void unSubscribe();

}
