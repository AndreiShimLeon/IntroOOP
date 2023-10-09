package Seminar4.Task1;

import java.sql.SQLOutput;
import java.util.List;

public class TeacherView<T extends Teacher> implements UserView<T>{
    @Override
    public void sendOnConsole(List<T> users) {
        System.out.println("Teachers: ");
        for (T teacher : users) {
            System.out.println("[" + teacher.getId() + "] " + teacher.getSurname() + " " + teacher.getName()  + " " + teacher.getPatronymic());
        }
        System.out.println("***".repeat(25));
    }
}
