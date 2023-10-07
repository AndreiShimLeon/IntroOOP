package Seminar3.Homework3;

import java.util.Comparator;

public class StudentComparatorByName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (o1.getLastName().length() + o1.getFirstName().length()) -
                (o2.getLastName().length() + o2.getFirstName().length());
    }

    @Override
    public Comparator<Student> reversed() {
        return Comparator.super.reversed();
    }
}
