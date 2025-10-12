package Behavioral.Command.LightTurnOnTurnOf;

public class Remote {

    private final LightCommand lightCommand;

    public Remote(LightCommand lightCommand) {
        this.lightCommand = lightCommand;
    }

    public void turnOnLight(String command) {
        lightCommand.doTask(command);
    }

    public void turnOffLight(String command) {
        lightCommand.undoTask(command);
    }
}
