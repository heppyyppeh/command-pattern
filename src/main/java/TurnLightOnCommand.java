public class TurnLightOnCommand implements Command {

    private Light light;

    TurnLightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOn();
    }
}
