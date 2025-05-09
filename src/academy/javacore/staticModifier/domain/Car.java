package academy.javacore.staticModifier.domain;

public class Car {
    private String model;
    private double maxSpeed;
    private static double speedLimit = 250;

    public Car(String model, double maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void printCarInformations() {
        System.out.println("-----------------");
        System.out.println("Modelo: " + this.model);
        System.out.println("Velocidade máxima: " + this.maxSpeed);
        System.out.println("Velocidade limite: " + Car.speedLimit);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public static double getSpeedLimit() {
        return Car.speedLimit;
    }

    public static void setSpeedLimit(double speedLimit) {
        Car.speedLimit = speedLimit;
    }
}
