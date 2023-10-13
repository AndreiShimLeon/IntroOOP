package Seminar5.Task;

import Seminar5.Task.data.Group;
import Seminar5.Task.data.Student;
import Seminar5.Task.data.Teacher;
import Seminar5.Task.view.View;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {


        View view = new View();

        Student student1 = new Student("Alice", "Alice", "01/01/1993");
        Student student2 = new Student("Bob", "Bob", "01/01/1993");
        Teacher teacher1 = new Teacher("Teacher1", "H","01/01/1993", "Biology");

        Student student3 = new Student("George", "Washington", "01/01/1993");
        Student student4 = new Student("James", "Bond", "01/01/1993");
        Student student5 = new Student("John", "Dow", "01/01/1993");
        Teacher teacher2 = new Teacher("Teacher2", "T","01/01/1993", "Math");

        List<Student> studentList1 = new ArrayList<>(List.of(student1, student2, student3));
        List<Student> studentList2 = new ArrayList<>(List.of( student4, student5));
//
//        Group group1 = new Group(studentList1, teacher1);
//        Group group2 = new Group(studentList2, teacher2);
//        view.createGroup(group1);
//        view.createGroup(group2);

        view.createGroup(new Group(studentList1,teacher1));
        view.createGroup(new Group(studentList2,teacher2));


        view.info();
        view.viewGroup(1);
        view.viewGroup(2);


    }
}