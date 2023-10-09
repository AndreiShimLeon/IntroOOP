package Seminar4.Task1;

import java.util.ArrayList;
import java.util.List;

// Контроллер для работы с группами студентов
class StudentController<T extends Student, S extends Teacher> implements UserController<T>{
    private List<StudentGroup<T, S>> groups;
    private StudentView<T> sv  = new StudentView<>();

    public StudentController() {
        groups = new ArrayList<>();
    }

    public void createGroup(String groupName, S teacher, List<T> students) {
        StudentGroup<T, S> group = new StudentGroup<>(groupName, teacher, students);
        groups.add(group);
    }

    public void addStudentToGroup(StudentGroup<T, S> group, T student) {
        group.addGroupMember(student);
    }

    public void removeStudentFromGroup(StudentGroup<T, S> group, T student) {
        group.removeGroupMember(student);
    }

    public List<StudentGroup<T, S>> getGroups() {
        return groups;
    }

    public StudentGroup<T, S> getGroupByName(String name){
        for (StudentGroup<T, S> group: groups
             ) {
            if(group.getNameGroup().equals(name)) return group;
        }
        return null;
    }

    @Override
    public T create(String name, String secondName, String middleName) {
        Student student = new Student(name, secondName, middleName);
        return (T) student;
    }

    public void sendOnConsoleAllGroups(){
        for (StudentGroup<T,S> group:groups
             ) {
            System.out.println("Group " + group.getNameGroup() + " contains " + group.getMemberList().size() + " students:");
            for (T student : group.getMemberList()) {
                this.sv.sendOnConsoleStudent(student);
            }
            System.out.println("Group " + group.getNameGroup() + " teacher is >>> " + group.getTeacher().getFullname());
            System.out.println("***".repeat(25));
        }
    }

    public void sendOnConsole(List<T> students){
        StudentView<T> tStudentView = new StudentView<T>();
        tStudentView.sendOnConsole(students);
    }
}
