package functional.mediator;

public class TestMediatorPattern {

    public static void main(String[] args) {
        Fan fan = new Fan();
        Button button = new Button();
        PowerSupply powerSupply = new PowerSupply();
        Mediator mediator = new MachineMediator(fan, powerSupply);
        fan.setMediator(mediator);
        button.setMediator(mediator);
        powerSupply.setMediator(mediator);
        System.out.println("Fan state: " + fan.isOn());

        button.press();
        System.out.println("Fan state: " + fan.isOn());

        button.press();
        System.out.println("Fan state: " + fan.isOn());
    }

}
