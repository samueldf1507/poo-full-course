package academy.javacore.assosiation.exercise.domain;

public class Teacher {
    private String name;
    private String specialty;
    private Seminar[] seminars;

    public Teacher(String name, String especialty) {
        this.name = name;
        this.specialty = especialty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getEspecialty() {
        return specialty;
    }

    public void setEspecialty(String especialty) {
        this.specialty = especialty;
    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }
}
