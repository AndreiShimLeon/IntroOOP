package Seminar4.Task1;

import java.util.List;

public class StudentView <T extends Student> implements UserView<T>{
    @Override
    public void sendOnConsole(List<T> users) {
        System.out.println("Students: ");
        for (T student : users) {
            System.out.println("[" + student.getId() + "] " + student.getSurname()+ " " + student.getName()+ " " + student.getPatronymic());
        }
        System.out.println("***".repeat(25));

    }

    public void sendOnConsoleStudent(T student) {
        System.out.println("[" + student.getId() + "] " + student.getSurname()+ " " + student.getName()+ " " + student.getPatronymic());


    }
}
