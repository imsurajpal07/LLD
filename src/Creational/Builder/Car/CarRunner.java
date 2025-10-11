package Creational.Builder.Car;

public class CarRunner {
    public static void main(String[] args) {

        Car rf = Car.builder("350", "RF")
                .seats("2")
                .build();
        System.out.println(rf);

        Creational.Builder.Car.separate.Car car = Creational.Builder.Car.separate.Car.builder("1200", "Tata")
                .color("red")
                .transmission("Automatic")
                .gps("Advanced")
                .seats("5")
                .build();
        System.out.println(car);
    }
}
