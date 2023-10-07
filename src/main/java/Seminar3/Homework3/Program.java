package Seminar3.Homework3;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Student s1 = new Student("1st","Andy", 22, 5);
        Student s2 = new Student("2nd", "Ge", 25, 2);
        Student s3 = new Student("Thirdy","Thomas", 18, 3);
        Student s4 = new Student("Fourth...","Jerry", 43, 1);
        Student s5 = new Student("Fifthy........","Andrew", 19, 1);

        ArrayList<Student>students1 = new ArrayList<Student>(List.of(s3,s4,s1,s2,s5));
        StudyGroup group001 = new StudyGroup(students1);


//////      Region Iterator
////        System.out.println(group001);
////        System.out.println("***".repeat(20));
////        for (Student student: group001
////             ) {
////            if(student.getAge()%2==0)
////                System.out.println(student);
////        }
//
//        Iterator<Student> studentGroupIterator = group001.iterator();
//        System.out.println(studentGroupIterator.next());
//        studentGroupIterator.remove();
//        System.out.println(group001);
//////         end Region Iterator

////        Region Service
//        StudyGroupService service = new StudyGroupService(group001);
//        service.removeStudentByLastName("1st");
//        for (Student student: group001
//             ) {
//            System.out.println(student);
//        }
//
////        end Region Service

////        Region Controller
//        Controller controller = new Controller();
//        controller.addGroupToControl(group001);
//        controller.removeStudentByLastName("Thirdy");
//        for (Student student: group001
//        ) {
//            System.out.println(student);
//        }

////        end Region Controller


//////        Region Comparable
//        Controller controller = new Controller();
//        controller.addGroupToControl(group001);
//        controller.sortStudentsByIDs();
//
//        for (Student student: group001
//        ) {
//            System.out.println(student);
//        }
//
//////        end Region Comparable


////        Region Comparator
//        Controller controller = new Controller();
//        controller.addGroupToControl(group001);
//        System.out.println("Sorting by name length");
//        controller.sortStudentsByNameLength();
//        System.out.println(group001);
//
//        System.out.println("---".repeat(10));
//        System.out.println("Sorting by last name");
//        controller.sortStudentsByName();
//        System.out.println(group001);
//        System.out.println("---".repeat(10));
//
//        System.out.println("Sorting by age");
//        controller.sortStudentsByAge();
//        System.out.println(group001);
//
//////        end Region Comparator

////        Region Stream Iterator
        Student s6 = new Student("Smith", "John", 23, 5);
        Student s7 = new Student("Banks", "Marry", 27, 2);
        Student s8 = new Student("Iron", "Holden", 21, 3);
        Student s9 = new Student("Doe", "John", 25, 8);
        Student s10 = new Student("Doe", "Natasha", 33, 1);
        Student s11 = new Student("Smith", "John", 23, 5);
        Student s12 = new Student("Banks", "John", 27, 2);
        Student s13 = new Student("Iron", "Holden", 21, 3);
        Student s14 = new Student("Doe", "John", 25, 8);
        Student s15 = new Student("Doe", "John", 33, 1);

        ArrayList<Student> students002 = new ArrayList<Student>(List.of(s9,s6));
        ArrayList<Student> students003 = new ArrayList<Student>(List.of(s10));
        ArrayList<Student> students004 = new ArrayList<Student>(List.of(s11));
        ArrayList<Student> students005 = new ArrayList<Student>(List.of(s12));
        ArrayList<Student> students006 = new ArrayList<Student>(List.of(s13,s14));
        StudyGroup group002 = new StudyGroup(students002);
        StudyGroup group003 = new StudyGroup(students003);
        StudyGroup group004 = new StudyGroup(students004);
        StudyGroup group005 = new StudyGroup(students005);
        StudyGroup group006 = new StudyGroup(students006);

        ArrayList<StudyGroup> stream001 = new ArrayList<StudyGroup>();
        ArrayList<StudyGroup> stream002 = new ArrayList<StudyGroup>();
        ArrayList<StudyGroup> stream003 = new ArrayList<StudyGroup>();
        stream001.add(group001);
        stream001.add(group002);
        stream002.add(group003);
        stream002.add(group004);
        stream002.add(group005);
        stream003.add(group006);

        ArrayList<Stream> streams = new ArrayList<>();
        streams.add(new Stream(stream001));
        streams.add(new Stream(stream002));
        streams.add(new Stream(stream003));
        System.out.println(streams);
        System.out.println("***".repeat(20));

        Controller controller = new Controller();
        controller.addStreams(streams);
        controller.sortStream();

        for (Stream stream: streams
             ) {
            System.out.println("Stream: ");
            for (StudyGroup group: stream.getStream()
                 ) {
                System.out.println("\t" + group);
            }
        }
////        end Region Stream Iterator




    }

}
