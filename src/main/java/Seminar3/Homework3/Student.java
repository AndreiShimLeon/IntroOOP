package Seminar3.Homework3;

public class Student{
    private int age;
    private String name;
    private int yearOfStudy;


    public Student(String name, int age, int yearOfStudy) {
        this.age = age;
        this.name = name;
        this.yearOfStudy = yearOfStudy;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    @Override
    public String toString() {
        return String.format("Student: %s, age %d, year of study: %d \n", name, age, yearOfStudy);
    }

}
