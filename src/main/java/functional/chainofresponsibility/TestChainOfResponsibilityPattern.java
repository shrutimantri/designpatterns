package functional.chainofresponsibility;

public class TestChainOfResponsibilityPattern {

    public static void main(String[] args) {
        Handler audioFileHandler = new AudioFileHandler();
        Handler imageFileHandler = new ImageFileHandler();
        imageFileHandler.setNextHandler(audioFileHandler);
        Handler textFileHandler = new TextFileHandler();
        textFileHandler.setNextHandler(imageFileHandler);

        textFileHandler.process("Text");
        System.out.println();
        textFileHandler.process("Image");
        System.out.println();
        textFileHandler.process("Audio");
        System.out.println();
        textFileHandler.process("Video");
    }

}
