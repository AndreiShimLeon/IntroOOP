package Seminar3.HomeworkBonus;

import java.util.Iterator;

public class Company implements Iterable<Employee>{

    Employee[] employees;

    public Company(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public Iterator<Employee> iterator() {
        return new EmployeesIterator(employees);
    }
}
