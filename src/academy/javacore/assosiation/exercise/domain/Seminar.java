package academy.javacore.assosiation.exercise.domain;

public class Seminar {
    private String title;
    private Local localization;
    private Student[] students;
    private Teacher teacher;


    public Seminar(String title, Local localization) {
        this.title = title;
        this.localization = localization;
    }

    public void printSeminarInformations() {
        System.out.println("Nome do seminário: " + this.title);
        System.out.println("Localização: " + this.localization.getAdress());
        if (this.teacher != null) {
            System.out.println("Professor responsável: " + this.teacher.getName());
        } else {
            System.out.println("Professor responsável: Não definido");
        }
        if (students == null) return;
        for (Student student: students) {
            System.out.println(student.getName());
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Local getLocalization() {
        return localization;
    }

    public void setLocalization(Local localization) {
        this.localization = localization;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
