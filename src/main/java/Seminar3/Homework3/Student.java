package Seminar3.Homework3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Student implements Comparable<Student> {
    public int getId() {
        return id;
    }

    private final int id;
    private static int idCounter = 1;
    private String lastName;
    private String firstName;
    private int age;
    private int yearOfStudy;

    public Student(String lastName, String firstName, int age, int yearOfStudy) {
        this.id = idCounter++;
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.yearOfStudy = yearOfStudy;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    @Override
    public String toString() {
        return "["+ id +
                "] " + lastName + " " + firstName + " " + age +
                ", yearOfStudy " + yearOfStudy;
    }

    @Override
    public int compareTo(Student o) {
        return this.id - o.getId();
    }
}
