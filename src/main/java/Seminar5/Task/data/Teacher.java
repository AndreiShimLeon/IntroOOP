package Seminar5.Task.data;

public class Teacher extends User{
    private String discipline;
    private final static String DEFAULT_DISCIPLINE = "vacant";

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public Teacher(String name, String lastName, String birthDate, String discipline) {
        super(name, lastName, birthDate);
         this.discipline = discipline;
    }

    public Teacher() {
        this("", "", "", DEFAULT_DISCIPLINE);
    }

    @Override
    public String toString() {
        return "\t\t[" + discipline + ']' +
                "[" + name + ' ' + lastName +
                " " + birthDate + ']';
    }
}

