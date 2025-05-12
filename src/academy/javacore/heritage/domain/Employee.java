package academy.javacore.heritage.domain;

public class Employee extends Person{
    private double salary;

    static {
        System.out.println("Dentro do bloco de inicialização estático");
    }
    {
        System.out.println("Dentro do bloco de inicialização não estático 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização não estático 2");
    }

    public Employee(String name) {
        super(name);
        System.out.println("Dentro do construtor de funcionário");
    }

    public void printInformations() {
        super.printInformations();
        System.out.println("Salário: " + this.salary + "R$");
    }

    public void paymentRecord() {
        System.out.println(this.name);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
