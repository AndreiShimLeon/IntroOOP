package Seminar3.Task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Student s1 = new Student("Andrew", 22, 5);
        Student s2 = new Student("George", 25, 2);
        Student s3 = new Student("Thomas", 18, 3);
        Student s4 = new Student("Jerry", 43, 1);

//        ArrayList <Student> students = new ArrayList<>();
//        students.add(s1);
//        students.add(s2);
//        students.add(s3);
//        students.add(s4);
        ArrayList <Student> students = new ArrayList<Student>(List.of(s1,s2,s3,s4));
        StudentGroupIterator studentGroupIterator = new StudentGroupIterator(students);

        System.out.println(studentGroupIterator);
//        studentGroupIterator.remove("Andrew", 22, 5);
//        System.out.println(studentGroupIterator);

        while(studentGroupIterator.hasNext()){
            System.out.println(studentGroupIterator.next());
        }
    }
}
