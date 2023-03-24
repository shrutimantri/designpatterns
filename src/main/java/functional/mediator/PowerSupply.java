package functional.mediator;

public class PowerSupply implements Colleague {

    private Mediator mediator;
    private boolean powerSupply = false;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void turnOn() {
        powerSupply = true;
    }

    public void turnOff() {
        powerSupply = false;
    }

}
