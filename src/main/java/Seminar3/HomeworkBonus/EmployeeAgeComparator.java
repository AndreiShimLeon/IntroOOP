package Seminar3.HomeworkBonus;

import java.util.Comparator;

public class EmployeeAgeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.getAge() - o1.getAge();
    }

//    @Override
//    public Comparator<Employee> reversed() {
//        return Comparator.super.reversed();
//    }
}
