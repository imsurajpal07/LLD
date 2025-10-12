package Behavioral.Command.LightTurnOnTurnOf;

public interface LightCommand {

    public void doTask(String command);

    public void undoTask(String command);
}
