package Seminar3.HomeworkBonus;

import com.sun.source.tree.Tree;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Andrey", 23, 50_304);
        Employee employee2 = new Employee("Volga", 33, 41_255);
        Employee employee3 = new Employee("Artem", 53, 87_485);
        Employee employee4 = new Employee("Konstantin", 18, 103_547);
        Employee employee5 = new Employee("Vladimir", 31, 45_854);
        Employee employee6 = new Employee("Olga", 27, 214_547);
        Company company = new Company(new Employee[]{employee1,employee2,employee3,employee4,employee5,employee6});

//        EmployeesIterator companyIterator = new EmployeesIterator(company.employees);
        Iterator<Employee> companyIterator = company.iterator();


        while (companyIterator.hasNext()) {
            System.out.println(companyIterator.next());
        }
        int index = 10;
        while (company.iterator().hasNext() && index > 0) {
            System.out.println(company.iterator().next());
            index--;
        }


//        TreeSet<Employee> employeesTree = new TreeSet<>(new EmployeeAgeComparator());
//        TreeSet<Employee> employeesTree = new TreeSet<>(new EmployeeAgeComparator().reversed());
        TreeSet<Employee> employeesTree = new TreeSet<>(new EmployeeSalaryComparator());
//        TreeSet<Employee> employeesTree = new TreeSet<>(new EmployeeSalaryReversedComparator());
        for (Employee emp: company
        ) {
            employeesTree.add(emp);
        }

        System.out.println(employeesTree);

        ArrayList<Employee> employeesArray = new ArrayList<>();
        for (Employee emp: company
             ) {
            employeesArray.add(emp);
        }
        employeesArray.sort((o1, o2) -> o2.getSalary()- o1.getSalary());
        System.out.println(employeesArray);

//        companyIterator.remove();
//        companyIterator.next();
//        companyIterator.remove();
//        companyIterator.remove();
//        companyIterator.next();
//        companyIterator.remove();
    }

}
