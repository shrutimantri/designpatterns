package functional.chainofresponsibility;

public class TextFileHandler implements Handler {

    private Handler nextHandler;

    @Override
    public void process(String fileType) {
        if ("Text".equals(fileType)) {
            System.out.println("Processing text file by: " + getHandlerName());
        } else if (nextHandler != null) {
            System.out.println(getHandlerName() + " forwarding request to " + nextHandler.getHandlerName());
            nextHandler.process(fileType);
        } else {
            System.out.println("No matching handler found for processing the request.");
        }
    }

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public String getHandlerName() {
        return "TextFileHandler";
    }
}
