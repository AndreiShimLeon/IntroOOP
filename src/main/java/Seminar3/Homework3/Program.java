package Seminar3.Homework3;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Student s1 = new Student("Andrew", 22, 5);
        Student s2 = new Student("George", 25, 2);
        Student s3 = new Student("Thomas", 18, 3);
        Student s4 = new Student("Jerry", 43, 1);
        Student s5 = new Student("John", 23, 5);
        Student s6 = new Student("Marry", 27, 2);
        Student s7 = new Student("Holden", 21, 3);
        Student s8 = new Student("Natasha", 33, 1);

//        ArrayList <Student> students = new ArrayList<>();
//        students.add(s1);
//        students.add(s2);
//        students.add(s3);
//        students.add(s4);
        ArrayList<Student> students1 = new ArrayList<Student>(List.of(s1, s2, s3, s4));
        ArrayList<Student> students2 = new ArrayList<Student>(List.of(s5, s6, s7));
        ArrayList<Student> students3 = new ArrayList<Student>(List.of(s8));
        GroupIterator studentGroupIterator1 = new GroupIterator(students1);
        GroupIterator studentGroupIterator2 = new GroupIterator(students2);
        GroupIterator studentGroupIterator3 = new GroupIterator(students3);

//        System.out.println(studentGroupIterator1);


        ArrayList<GroupIterator> stream1 = new ArrayList<GroupIterator>(List.of(studentGroupIterator1, studentGroupIterator2,studentGroupIterator3));
        StreamIterator stream = new StreamIterator(stream1);
        System.out.println(stream);
        System.out.println("****".repeat(20));
        StreamService.sortSize(stream);
//        StreamService.sortSize(stream);
        System.out.println(stream);
    }
}
