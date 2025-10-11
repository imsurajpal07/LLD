package Creational.Builder.Car;

public class Car {

    private final String engine;
    private final String brand;
    private final String transmission;
    private final String seats;
    private final String color;
    private final String gps;

    private Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.brand = builder.brand;
        this.transmission = builder.transmission;
        this.seats = builder.seats;
        this.color = builder.color;
        this.gps = builder.gps;
    }

    public static CarBuilder builder(String engine, String brand) {
        return new CarBuilder(engine, brand);
    }

    public static class CarBuilder {

        private final String engine;
        private final String brand;
        private String transmission;
        private String seats;
        private String color;
        private String gps;

        public CarBuilder(String engine, String brand) {
            this.engine = engine;
            this.brand = brand;
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
            return new Car(this);
        }
    }

    public String getEngine() {
        return engine;
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
