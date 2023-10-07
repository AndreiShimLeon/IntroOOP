package Seminar3.Homework3;

import java.util.ArrayList;
import java.util.Iterator;

public class StudyGroup implements Iterable<Student>{

    public int getId() {
        return id;
    }

    private final int id;
    private static int idCounter = 1;
    public ArrayList<Student> getGroup() {
        return group;
    }

    public void setGroup(ArrayList<Student> group) {
        this.group = group;
    }

    private ArrayList<Student> group;

    public StudyGroup(ArrayList<Student> group) {
        this.group = group;
        this.id = idCounter++;
    }

    @Override
    public Iterator<Student> iterator() {
        return new GroupIterator(group);
    }

    public ArrayList<Student> getStudentbyLastName(String lastName) {
        ArrayList<Student> result = new ArrayList<>();
        this.group.forEach(o -> {
            if (o.getLastName().equals(lastName)) result.add(o);
        });
        return result;
    }


    public void addStudent(Student student){
        this.group.add(student);
    }

    public void removeStudent(Student student){
        this.group.remove(student);
    }



    @Override
    public String toString() {
        String s = "\tStudyGroup " + this.id + " \n";
        for (Student student: group
             ) {
            s+= "\t[" + student.getId() + "] " + student.getLastName()+
                    " " + student.getFirstName() + " " + student.getAge() + " " + student.getYearOfStudy() + "\n";
        };
        return s;
    }
}
