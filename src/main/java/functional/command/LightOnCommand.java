package functional.command;

// ConcreteCommand
public class LightOnCommand implements Command {

    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("Switching on lights..");
        light.switchOn();
    }

}
