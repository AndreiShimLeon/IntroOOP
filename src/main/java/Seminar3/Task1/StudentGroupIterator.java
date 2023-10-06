package Seminar3.Task1;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentGroupIterator implements Iterator<Student> {
    ArrayList<Student> group = new ArrayList<>();

    public StudentGroupIterator(ArrayList<Student> group) {
        this.group = group;
    }

    private int index;

    public int getIndex() {
        return index;
    }

    @Override
    public boolean hasNext() {
        return index < group.size();
    }

    @Override
    public Student next() {
        if (hasNext()) return group.get(index++);
        throw new ArrayIndexOutOfBoundsException();
    }

    @Override
    public void remove() {
        group.remove(index);
    }

    public Student searchStudent(String name, int age, int yearOfStudy) {
        for (Student student : group) {
            if (student.getName().equals(name) &&
                    student.getAge() == age &&
                    student.getYearOfStudy() == yearOfStudy) {
                return student;
            }
        }
        throw new ArrayIndexOutOfBoundsException();
    }
    public boolean remove(String name, int age, int yearOfStudy) {
        for (index = 0; index < group.size(); index++) {
            if (group.get(index).getName().equals(name) &&
                    group.get(index).getAge() == age &&
                    group.get(index).getYearOfStudy() == yearOfStudy) {
                        group.remove(index);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        for (Student student: group
             ) {
            System.out.println(student);
        }
        return "end";
    }
}
