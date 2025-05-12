package academy.javacore.heritage.test;

import academy.javacore.heritage.domain.Adress;
import academy.javacore.heritage.domain.Employee;
import academy.javacore.heritage.domain.Person;

public class HeritageTest01 {
    public static void main(String[] args) {
        Adress adress = new Adress();
        adress.setStreet("Rua 3");
        adress.setCep("12345-678");

        Person person = new Person("Samuel");

        person.setCpf("11111111");
        person.setAdress(adress);

        person.printInformations();

        Employee employee = new Employee("Leo");

        employee.setCpf("010101-69");
        employee.setAdress(adress);
        employee.setSalary(2000);

        System.out.println("------------");
        employee.printInformations();
    }
}
