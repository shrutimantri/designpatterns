package functional.mediator;

public class MachineMediator implements Mediator {
    private final Fan fan;
    private final PowerSupply powerSupply;

    public MachineMediator(Fan fan, PowerSupply powerSupply) {
        this.fan = fan;
        this.powerSupply = powerSupply;
    }

    public void press() {
        if (fan.isOn()) {
            fan.turnOff();
        } else {
            fan.turnOn();
        }
    }

    public void start() {
        powerSupply.turnOn();
    }

    public void stop() {
        powerSupply.turnOff();
    }

}
