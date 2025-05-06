package academy.javacore.methods.domain;

public class Person {
    private String name;
    private int age;

    public void printInformations() {
        System.out.println("Nome: " + this.name);
        System.out.println("Idade: " + this.age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("idade inválida");
            return;
        }
        this.age = age;
    }
}
