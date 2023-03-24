package functional.mediator;

public class Button implements Colleague {

    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void press(){
        System.out.println("Button pressed.");
        mediator.press();
    }

}
