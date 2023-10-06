package Seminar3.Homework3;

import java.util.ArrayList;
import java.util.Iterator;

public class GroupIterator implements Iterator<Student> {
    private ArrayList<Student> group = new ArrayList<>();

    public ArrayList<Student> getGroup() {
        return group;
    }

    public void setGroup(ArrayList<Student> group) {
        this.group = group;
    }

    public GroupIterator(ArrayList<Student> group) {
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
        String s = "\n Group"+ "\n";
        for (Student student: group){
            s+='\t'+student.toString() + '\n';
        }
        return s;
    }
}
