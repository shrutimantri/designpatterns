package functional.mediator;

public class Fan implements Colleague {

    private Mediator mediator;
    private boolean isOn = false;

    public boolean isOn() {
        return isOn;
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void turnOn() {
        mediator.start();
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
        mediator.stop();
    }

}
