package functional.command;

// ConcreteCommand
public class LightOffCommand implements Command {

    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("Switching off lights..");
        light.switchOff();
    }

}
