package Behavioral.Command.LightTurnOnTurnOf;

public class LightCommandImpl implements LightCommand {

    private final Light light;

    public LightCommandImpl(Light light) {
        this.light = light;
    }

    @Override
    public void doTask(String command) {
        light.turnOn(command);
    }

    @Override
    public void undoTask(String command) {
        light.turnOff(command);
    }
}
