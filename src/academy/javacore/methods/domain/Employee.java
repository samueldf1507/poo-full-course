package academy.javacore.methods.domain;

public class Employee {
    public String name;
    public int age;
    public double[] salaries;

    public void printInformations() {
        System.out.println("Nome: " + this.name);
        System.out.println("Idade: " + this.age);
        if (salaries == null) {
            return;
        }
        System.out.println("Salários: ");
        for (double salary: salaries) {
            System.out.print(salary + " ");
        }
    }

    public double avarageSalary() {
        double sum = 0;
        for (double salary: salaries) {
            sum += salary;
        }
        double avarage = sum / 3;
        return avarage;
    }


}
