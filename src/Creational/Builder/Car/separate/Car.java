package Creational.Builder.Car.separate;

public class Car {
    private String engine;
    private String brand;
    private String transmission;
    private String seats;
    private String color;
    private String gps;

    private Car(CarBuilder builder) {
        this.engine = builder.getEngine();
        this.brand = builder.getBrand();
        this.transmission = builder.getTransmission();
        this.seats = builder.getSeats();
        this.color = builder.getColor();
        this.gps = builder.getGps();
    }

    public static CarBuilder builder(String engine, String brand) {
        return CarBuilder.create(engine, brand);
    }

    public static Car fromCar(CarBuilder carBuilder) {
        return new Car(carBuilder);
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", brand='" + brand + '\'' +
                ", transmission='" + transmission + '\'' +
                ", seats='" + seats + '\'' +
                ", color='" + color + '\'' +
                ", gps='" + gps + '\'' +
                '}';
    }
}
