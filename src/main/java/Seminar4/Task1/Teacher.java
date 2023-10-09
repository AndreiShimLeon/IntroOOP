package Seminar4.Task1;

public class Teacher extends User{

    private String fullname = this.surname + " " + this.name + " " + this.patronymic;
    public Teacher(String name, String surname, String patronymic) {
        super(name, surname, patronymic);
    }

    public String getFullname() {
        return fullname;
    }
}
