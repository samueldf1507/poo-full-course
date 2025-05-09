package academy.javacore.staticModifier.test;

import academy.javacore.staticModifier.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car1 = new Car("Civic Type R", 280);

        Car car2 = new Car("Mercedes AMG", 275);
        Car car3 = new Car("BMW M3", 290);
        Car.setSpeedLimit(180);
        car1.printCarInformations();
        car2.printCarInformations();
        car3.printCarInformations();
    }
}
