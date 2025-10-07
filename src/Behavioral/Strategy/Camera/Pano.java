package Behavioral.Strategy.Camera;

public class Pano implements ICamera{
    @Override
    public void doClick(String type) {
        System.out.println("Clicked By : " + type);
    }
}
