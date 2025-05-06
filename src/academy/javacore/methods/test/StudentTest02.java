package academy.javacore.methods.test;

import academy.javacore.methods.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Samuel";
        student.age = 19;
        student.gender = 'M';

        student.printInformations();
    }
}
