package academy.javacore.methods.test;

import academy.javacore.methods.domain.Employee;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Samuel";
        employee.age = 19;
        employee.salaries = new double[]{1000, 2000, 3000};

        employee.printInformations();
        System.out.println("\nMédia salárial: " + employee.avarageSalary());

    }
}
