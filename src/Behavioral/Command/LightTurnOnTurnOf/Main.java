package Behavioral.Command.LightTurnOnTurnOf;

public class Main {

    public static void main(String[] args) {

        Light light = new Light();
        LightCommandImpl lightCommand = new LightCommandImpl(light);
        Remote remote = new Remote(lightCommand);
        remote.turnOffLight("Turn On.");
        remote.turnOnLight("Turn Off.");
        remote.turnOffLight("Turn On.");
        remote.turnOnLight("Turn Off.");
    }
}
