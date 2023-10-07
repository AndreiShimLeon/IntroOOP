package Seminar3.HomeworkBonus;

import java.util.Iterator;

public class EmployeesIterator implements Iterator<Employee> {

    private Employee[] employees;
    private int index;
    public EmployeesIterator(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public boolean hasNext() {
        return index < employees.length;
    }

    @Override
    public Employee next() {
        return employees[index++];
    }

    @Override
    public void remove() {
        Employee[] employees1 = new Employee[employees.length - 1];
        int cursor1 = 0;
        int cursor2 = 0;
        while(cursor2 < employees.length) {
            if(index != cursor2){
                employees1[cursor1++] = employees[cursor2++];
            } else {
                cursor2++;
            }
        }
        this.employees = employees1;
    }
}
