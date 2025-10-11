package Creational.Builder.Car.separate;

public class CarBuilder {

    private String engine;
    private String brand;
    private String transmission;
    private String seats;
    private String color;
    private String gps;

    private CarBuilder(String engine, String brand) {
        this.engine = engine;
        this.brand = brand;
    }

    public static CarBuilder create(String engine, String brand) {
        return new CarBuilder(engine, brand);
    }

    public CarBuilder transmission(String transmission) {
        this.transmission = transmission;
        return this;
    }

    public CarBuilder seats(String seats) {
        this.seats = seats;
        return this;
    }

    public CarBuilder color(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder gps(String gps) {
        this.gps = gps;
        return this;
    }

    public Car build() {
        return Car.fromCar(this);
    }

    public String getEngine() {
        return engine;
    }

    public String getBrand() {
        return brand;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getSeats() {
        return seats;
    }

    public String getColor() {
        return color;
    }

    public String getGps() {
        return gps;
    }
}
