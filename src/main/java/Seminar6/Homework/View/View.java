package Seminar6.Homework.View;

import Seminar6.Homework.Controller.GroupController;
import Seminar6.Homework.Controller.GroupHeadController;
import Seminar6.Homework.Controller.StudentController;
import Seminar6.Homework.Data.GroupHead;
import Seminar6.Homework.Data.Student;

/*
 *  Single responsibility principle (Принцип единственной ответственности)
        View отвечает только за вывод информации
 *  Open-closed principle (Принцип открытости/закрытости)
        Здесь не применимо
 *  Liskov substitution principle (Принцип подстановки Лисков)
        Здесь не применимо
 *  Interface segregation principle (Принцип разделения интерфейса)
        Здесь не применимо
 *  Dependency inversion principle (Принцип инверсии зависимостей)
        Задействованные класс не затрагиваются при работе с View
 */

public class View {
    private GroupController<Student, GroupHead> groupController = new GroupController<>();

    public View(GroupController<Student, GroupHead> groupController) {
        this.groupController = groupController;
    }

    public void viewStudents() {
        String print = "Group [" + groupController.getGroup().getNameGroup() +
                "]\n" + "\tСтароста группы " + groupController.getGroup().getGroupHead() + "\n\tCписок студентов: \n";
        for (Student student : groupController.getGroup().getGroup()
        ) {
            print += "\t\t" + student + "\n";
        }
        System.out.println(print);
    }


}
