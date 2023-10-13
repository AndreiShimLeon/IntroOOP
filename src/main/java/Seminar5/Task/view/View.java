package Seminar5.Task.view;

import Seminar5.Task.controller.Controller;
import Seminar5.Task.data.Group;
import Seminar5.Task.data.Student;

import java.util.List;

public class View {
    Controller controller = new Controller();

    public void createGroup(Group group){
        controller.addGroup(group);
    }

    public void createStudent(String name, String lastname, String birthDate, int groupID){
        Student student = controller.createStudent(name, lastname, birthDate);
        controller.addStudent(student, groupID);
    }

    public void viewGroup(int groupID){
        Group group = Controller.getGroupById(groupID);
        System.out.println("Group [" + group.getId() + "] " + group.getStudents().toString() + "\nTeacher: " + group.getTeacher().toString());
    }

    public void info(){
        System.out.println(controller);
    }
}
