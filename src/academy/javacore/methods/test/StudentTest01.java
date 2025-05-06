package academy.javacore.methods.test;

import academy.javacore.methods.domain.PrintStudent;
import academy.javacore.methods.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        student1.name = "Samuel";
        student1.age = 19;
        student1.gender = 'M';

        student2.name = "Felipe";
        student2.age = 21;
        student2.gender = 'M';


        PrintStudent printStudent = new PrintStudent();
        printStudent.printStudent(student1);
        printStudent.printStudent(student2);

    }
}
