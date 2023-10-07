package Seminar3.Homework3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class StudyGroupService {
    StudyGroup group;

    public StudyGroupService(StudyGroup group) {
        this.group = group;
    }

    public void removeStudentByLastName(String lastName){
        for (Student student:group
             ) {
            if(student.getLastName().equals(lastName)) group.removeStudent(student);
        }
    }

    public void sortGroupByNameLength(){
        group.getGroup().sort(new StudentComparatorByName());
    }

    public void sortGroupByName(){
        group.getGroup().sort((o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));
    }

    public void sortGroupByAge(){
        group.getGroup().sort((o1, o2) -> Integer.compare(o1.getAge(), o2.getAge()));
    }

    public void sortGroupByIDs(){
        TreeSet<Student> treeSet = new TreeSet<Student>();
        for (Student student : group
             ) {
            treeSet.add(student);
        }
        ArrayList<Student> temp = new ArrayList<Student>();
        temp.addAll(treeSet);
        this.group.setGroup(temp);
    }
}
