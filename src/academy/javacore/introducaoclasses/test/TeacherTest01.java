package academy.javacore.introducaoclasses.test;

import academy.javacore.introducaoclasses.domain.Teacher;

public class TeacherTest01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "Mestre Kami";
        teacher.age = 70;
        teacher.gender = 'M';

        System.out.println(teacher.name);
        System.out.println(teacher.age);
        System.out.println(teacher.gender);
    }
}
