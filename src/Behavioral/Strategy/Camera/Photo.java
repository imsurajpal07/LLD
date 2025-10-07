package Behavioral.Strategy.Camera;

public class Photo implements ICamera{
    @Override
    public void doClick(String type) {
        System.out.println("Clicked By: " + type);
    }
}
