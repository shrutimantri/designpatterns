package functional.chainofresponsibility;

public class AudioFileHandler implements Handler {

    private Handler nextHandler;

    @Override
    public void process(String fileType) {
        if ("Audio".equals(fileType)) {
            System.out.println("Processing audio file by: " + getHandlerName());
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
        return "AudioFileHandler";
    }
}
