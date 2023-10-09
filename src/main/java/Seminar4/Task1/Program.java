package Seminar4.Task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {

        // Создаем контроллер
        StudentController<Student, Teacher> controller = new StudentController<>();

        // Создаем группу A и добавляем студентов и учителя
        Student student1 = new Student("Alice", "Alice", "Alice");
        Student student2 = new Student("Bob", "Bob", "Bob");
        Teacher teacher1 = new Teacher("Teacher1", "H","H");
        controller.createGroup("A", teacher1, new ArrayList<>(List.of(student1, student2)));

//        // Выводим список студентов в группе
//        StudentGroup<Student, Teacher> groupA = controller.getGroupByName("Group A");
//        System.out.println("group " + groupA.getNameGroup() + " contains:");
//        for (Student student : groupA.getStudentList()) {
//            System.out.println("[" + student.getId() + "] " + student.getName());
//        }
//        System.out.println(groupA.getNameGroup() + " teacher is >>> " + groupA.getTeacher().getName());



        Student student3 = controller.create("George", "Washington", "Alexandrovich");
        Student student4 = controller.create("James", "Bond", "Viktorovich");
        Student student5 = controller.create("John", "Dow", "Igorevich");
        Teacher teacher2 = new Teacher("Teacher2", "T","T");
        controller.createGroup("B", teacher2, new ArrayList<>(List.of(student3, student4,student5)));

//        // Выводим список студентов в группе

        controller.sendOnConsole(controller.getGroupByName("A").getMemberList()); // группа А
        controller.sendOnConsoleAllGroups();

        // Создаем группу учителей

        TeacherController<Teacher> tController = new TeacherController<>();
        Teacher teacher3 = tController.create("Vlad", "Kruglov", "Andreevich");
        Teacher teacher4 = tController.create("Andrei", "Goblach", "Vladimirovich");
        Teacher teacher5 = tController.create("Helen", "Cruz", "");
        Teacher teacher6 = tController.create("Eugene", "Iron", "");

        tController.createTeacherGroup(new ArrayList<Teacher>(List.of(teacher3, teacher4, teacher5,teacher6)));
        tController.viewTeachersList();

        // Меняем учителей в двух группах
        StudentGroup<Student, Teacher> groupA = controller.getGroupByName("A");
        StudentGroup<Student, Teacher> groupB = controller.getGroupByName("B");
        tController.setTeacherGroup(groupA, teacher3);
        tController.setTeacherGroup(groupB, teacher5);
        controller.sendOnConsoleAllGroups();
    }
}