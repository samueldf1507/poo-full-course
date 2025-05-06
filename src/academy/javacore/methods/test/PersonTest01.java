package academy.javacore.methods.test;

import academy.javacore.methods.domain.Person;

public class PersonTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Samuel");
        person.setAge(19);
        person.printInformations();

        System.out.println("------------------");
        System.out.println(person.getName());
        System.out.println(person.getAge());

    }
}
