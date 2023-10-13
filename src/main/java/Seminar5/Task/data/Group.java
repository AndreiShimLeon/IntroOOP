package Seminar5.Task.data;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Student> students;
    private Teacher teacher;
    private final int id;
    private static int idCounter = 1;

    public int getId() {
        return id;
    }

    public Student createStudent(String name, String lastname, String birthDate){
        return new Student(name, lastname, birthDate);
    }

    public Teacher createTeacher(String name, String lastname, String birthDate, String discipline){
        return new Teacher(name, lastname, birthDate, discipline);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Student searchStudent(String name, String lastname, String birthDate){
        if(!name.isEmpty() && !lastname.isEmpty() && !birthDate.isEmpty()){
            for (Student student: students
                 ) {
                if(name.equals(student.name) && lastname.equals(student.lastName) && birthDate.equals(student.birthDate)) return student;
            }
        }
        return null;
    }

    public Student searchStudent(int id){
        if(id > 0){
            for (Student student : students
                 ) {
                if(Integer.compare(student.getId(), id) == 0) return student;
            }
        }
        return null;
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Group(List<Student> students, Teacher teacher) {
        this.students = students;
        this.teacher = teacher;
        this.id = idCounter++;
    }

    public Group(){
        this.students = new ArrayList<>();
        this.teacher = new Teacher();
        this.id = idCounter++;
    }

    @Override
    public String toString() {
        return "\nGroup" + " [" + id +"]\n" +
                 "\tstudents\n\t\t" + students +
                "\n\tteacher\n" + teacher;
    }
}
