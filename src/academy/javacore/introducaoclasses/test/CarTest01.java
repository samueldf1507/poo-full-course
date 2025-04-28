package academy.javacore.introducaoclasses.test;

import academy.javacore.introducaoclasses.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.model = "Civic Type R";
        car1.year = 2023;
        car1.color = "Preto";

        System.out.println(car1.model + " | " + car1.year + " | " + car1.color);

        Car car2 = new Car();
        car2.model = "Mustang Shelby";
        car2.year = 2025;
        car2.color = "Vermelho";

        System.out.println(car2.model + " | " + car2.year + " | " + car2.color);
    }
}
