package Seminar4.Task1;

import java.util.List;

public class TeacherController<T extends Teacher> implements UserController<T>{
    TeacherService ts = new TeacherService();

    TeacherView tv = new TeacherView();
    TeacherGroup<T> teacherGroup;
    @Override
    public T create(String name, String surname, String patronymic) {
        return (T) this.ts.create(name, surname,patronymic);
    }

    public T search(String name, String surname, String patronymic){
        for (T teacher: this.teacherGroup.getMemberList()
             ) {
            if(teacher.getName().equals(name)&&
            teacher.getSurname().equals(surname)&&
            teacher.getPatronymic().equals(patronymic)) return (T) teacher;
        }
        return null;
    }

    public void correctTeacher(T teacher, String newName, String newSurname, String newPatronymic){
        teacher.setName(newName);
        teacher.setSurname(newSurname);
        teacher.setPatronymic(newPatronymic);
    }

    public void setTeacherGroup(StudentGroup studentGroup, T newTeacher){
        studentGroup.setTeacher(newTeacher);
        System.out.println("Group " + studentGroup.getNameGroup() + " teacher has been replaced by " + newTeacher.getSurname() + " " + newTeacher.getName());
        System.out.println("---".repeat(25));
    }


    public void createTeacherGroup(List<T> teachers){
        this.teacherGroup = new TeacherGroup<>(teachers);
    }
    public void viewTeacher(T teacher){
        System.out.println(teacher);
    }

    public void viewTeachersList(){
        this.tv.sendOnConsole(this.teacherGroup.getMemberList());
    }


}
