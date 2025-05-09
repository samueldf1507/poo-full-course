package academy.javacore.assosiation.test;

import academy.javacore.assosiation.domain.School;
import academy.javacore.assosiation.domain.Teacher;

public class SchoolTest01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Jiraya Sensei");
        Teacher teacher2 = new Teacher("Kakashi Sensei");
        Teacher[] teachers = {teacher, teacher2};
        School school = new School("Konoha", teachers);
        school.printSchoolInformations();
    }
}
