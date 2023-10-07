package Seminar3.Homework3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Student s1 = new Student("Andrew", 22, 5);
        Student s2 = new Student("George", 25, 2);
        Student s3 = new Student("Thomas", 18, 3);
        Student s4 = new Student("Jerry", 43, 1);
        Student s5 = new Student("Andrew", 43, 1);

        ArrayList<Student>students1 = new ArrayList<Student>(List.of(s1,s2,s3,s4,s5));
        StudyGroup group001 = new StudyGroup(students1);
        System.out.println(group001);


////      Region Iterator
//        for (Student student: group001
//             ) {
//            if(student.getAge()%2==0)
//                System.out.println(student);
//        }
//
//        Iterator<Student> studentGroupIterator = group001.iterator();
//        System.out.println(studentGroupIterator.next());
//        studentGroupIterator.remove();
//        System.out.println(group001);
////         end Region Iterator

////        Region Service
//        StudyGroupService service = new StudyGroupService(group001);
//        service.removeStudentByName("Andrew");
//        for (Student student: group001
//             ) {
//            System.out.println(student);
//        }
//
////        end Region Service

////        Region Controller
//        Controller controller = new Controller(group001);
//        controller.removeStudentByName("Andrew");
//        for (Student student: group001
//        ) {
//            System.out.println(student);
//        }
//
////        end Region Controller


//        Region Comparable


//        for (Student student: group001
//        ) {
//            System.out.println(student);
//        }
//
////        end Region Comparable

        Student s6 = new Student("John", 23, 5);
        Student s7 = new Student("Marry", 27, 2);
        Student s8 = new Student("Holden", 21, 3);
        Student s9 = new Student("Natasha", 33, 1);


    }

}
