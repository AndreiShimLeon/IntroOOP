package Seminar3.Homework3;

public class StudyGroupService {
    StudyGroup group;

    public StudyGroupService(StudyGroup group) {
        this.group = group;
    }

    public void removeStudentByName(String name){
        for (Student student:group
             ) {
            if(student.getName().equals(name)) group.removeStudent(student);
        }
    }
}
