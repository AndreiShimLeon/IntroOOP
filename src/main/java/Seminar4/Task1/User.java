package Seminar4.Task1;

// Параметризованный класс для представления группы студентов
class User {
    protected int id;
    protected static int idCounter = 1;
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    protected String surname;
    protected String patronymic;

    public User(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.id = idCounter++;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return " [" + id + "] " + name + ' ' +
                surname + ' ' +
                patronymic + ' ';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }
}
