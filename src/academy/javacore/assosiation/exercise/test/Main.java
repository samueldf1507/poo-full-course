package academy.javacore.assosiation.exercise.test;

import academy.javacore.assosiation.exercise.domain.Local;
import academy.javacore.assosiation.exercise.domain.Seminar;
import academy.javacore.assosiation.exercise.domain.Student;
import academy.javacore.assosiation.exercise.domain.Teacher;

public class Main {
    public static void main(String[] args) {
        Local local = new Local("Rua Palestra Legal 1401");
        Local local2 = new Local("Rua Palestra Foda 1700");
        Teacher teacher1 = new Teacher("Carlos", "Cibersegurança");
        Teacher teacher2 = new Teacher("Mario", "Inteligência Artificial e economia");
        Seminar seminar1 = new Seminar("Computação", local);
        Seminar seminar2 = new Seminar("Economia", local2);
        Seminar[] seminarsTeacher1 = {seminar1};
        Seminar[] seminarsTeacher2 = {seminar1, seminar2};

        teacher1.setSeminars(seminarsTeacher1);
        teacher2.setSeminars(seminarsTeacher2);

        Student student1 = new Student("Samuel", 19);
        Student student2 = new Student("Alexandre", 20);
        Student[] studentsSeminar1 = {student1, student2};
        seminar1.setStudents(studentsSeminar1);

        Student student3 = new Student("Leo", 21);
        Student student4 = new Student("Vini", 21);
        Student[] studentsSeminar2 = {student3, student4};
        seminar2.setStudents(studentsSeminar2);

        seminar1.setTeacher(teacher1);
        seminar2.setTeacher(teacher2);




        seminar1.printSeminarInformations();

        System.out.println("------------------------------");

        seminar2.printSeminarInformations();







    }
}
