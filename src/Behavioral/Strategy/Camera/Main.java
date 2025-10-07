package Behavioral.Strategy.Camera;

public class Main {
    public static void main(String[] args) {
        CameraContext cameraContext = new CameraContext(new Photo());
        CameraContext cameraContext1 = new CameraContext(new Pano());
        cameraContext.doClick("photo");
        cameraContext1.doClick("pano");
    }
}
