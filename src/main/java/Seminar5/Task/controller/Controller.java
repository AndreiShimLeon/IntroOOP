package Seminar5.Task.controller;

import Seminar5.Task.data.Group;
import Seminar5.Task.data.Student;
import Seminar5.Task.data.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private static List<Group> stream = new ArrayList<Group>();

    public Student createStudent(String name, String lastname, String birthDate){
        return new Student(name, lastname, birthDate);
    }

    public Teacher createTeacher(String name, String lastname, String birthDate, String discipline){
        return new Teacher(name, lastname, birthDate, discipline);
    }

    public void addGroup(Group group){
        stream.add(group);
    }

    public static Group getGroupById(int id){
        for (Group group: stream
             ) {
            if(id == group.getId()) return group;
        }
        System.out.println("Group with the provided ID doesn't exist");
        return null;
    }

    public void addStudent(Student student, int groupID){
        getGroupById(groupID).addStudent(student);
    }

    public void addTeacher(Teacher teacher, int groupID){
        getGroupById(groupID).setTeacher(teacher);
    }

    @Override
    public String toString() {
        return stream.toString();
    }
}
