package functional.chainofresponsibility;

public interface Handler {

    void process(String fileType);

    void setNextHandler(Handler handler);

    String getHandlerName();

}
