package Seminar3.HomeworkBonus;

public class Employee implements Comparable<Employee>{
    private String name;
    private int age;
    private int salary;
    private final int id;
    private static int idCounter = 1;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.id = idCounter++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "[" + id+
                "] " + name + ", age=" + age +
                ", salary: " + salary;
    }


    @Override
    public int compareTo(Employee o) {
        return this.age-o.age;
    }
}
