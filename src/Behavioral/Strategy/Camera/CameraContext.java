package Behavioral.Strategy.Camera;

public class CameraContext {
    private final ICamera camera;

    public CameraContext(ICamera camera) {
        this.camera = camera;
    }

    public void doClick(String type)
    {
        camera.doClick(type);
    }
}
