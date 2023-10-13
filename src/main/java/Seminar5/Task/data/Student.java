package Seminar5.Task.data;

public class Student extends User{

    private final int id;
    private static int idCounter = 1;

    public int getId() {
        return id;
    }

    public Student(String name, String lastName, String birthDate) {
        super(name, lastName, birthDate);
        this.id = idCounter++;
    }

    public Student() {
        this(" "," "," ");
    }

    @Override
    public String toString() {
        return "[" + id + ']' +
                "[" + name + ' ' + lastName +
                " " + birthDate + ']';
    }
}
