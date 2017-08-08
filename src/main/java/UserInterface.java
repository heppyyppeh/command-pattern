class UserInterface {

    private Light light;
    private SwitchBoard switchBoard;
    private TurnLightOnCommand lightOnCommand;

    UserInterface() {
        this.light = new Light();
        this.switchBoard = new SwitchBoard();
        this.lightOnCommand = new TurnLightOnCommand(light);
    }

    void pushLightSwitch() {
        switchBoard.executeCommand(lightOnCommand);
    }

    Light getLight() {
        return light;
    }
}
