package Seminar4.Task1;

import java.util.Iterator;
import java.util.List;

class StudentGroup<T extends Student, S extends Teacher> extends Group<T>{

    private S teacher;
    private String nameGroup;

    public StudentGroup(String nameGroup, S teacher, List<T> group) {
        super(group);
        this.nameGroup = nameGroup;
        this.teacher = teacher;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public S getTeacher() {
        return teacher;
    }

    public void setTeacher(S teacher) {
        this.teacher = teacher;
    }

}
