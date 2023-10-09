package Seminar4.Task1;

import java.util.List;

public class TeacherGroup<T extends Teacher> extends Group<T> {
    public TeacherGroup(List<T> group) {
        super(group);
    }
}
