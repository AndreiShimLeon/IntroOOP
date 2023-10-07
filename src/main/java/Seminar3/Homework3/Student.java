package Seminar3.Homework3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Student {
    private final int id;
    private static int idCounter = 1;
    private String name;
    private int age;
    private int yearOfStudy;

    public Student(String name, int age, int yearOfStudy) {
        this.id = idCounter++;
        this.name = name;
        this.age = age;
        this.yearOfStudy = yearOfStudy;
    }

    public int getAge() {
        return age;
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
        return "\n["+ id +
                "] " + name + " " + age +
                ", yearOfStudy " + yearOfStudy;
    }
}
