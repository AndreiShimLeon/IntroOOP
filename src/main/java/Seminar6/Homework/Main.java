package Seminar6.Homework;

import Seminar6.Homework.Controller.GroupController;
import Seminar6.Homework.Controller.GroupHeadController;
import Seminar6.Homework.Controller.StudentController;
import Seminar6.Homework.Data.*;
import Seminar6.Homework.View.View;

import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        GroupController<Student, GroupHead> groupController = new GroupController<>();

        Student student1 = new Student("George", "Washington", "Alexandrovich");
        Student student2 = new Student("James", "Bond", "Viktorovich");
        Student student3 = new Student("John", "Dow", "Igorevich");


        groupController.createGroup("A");
        groupController.addStudentToGroup(student1);
        groupController.addStudentToGroup(student2);
        groupController.addStudentToGroup(student3);
        groupController.setHeadGroup(student1);

        View view = new View(groupController);
        view.viewStudents();

    }
}