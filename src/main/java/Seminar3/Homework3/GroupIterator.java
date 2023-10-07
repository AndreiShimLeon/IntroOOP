package Seminar3.Homework3;

import java.util.ArrayList;
import java.util.Iterator;

public class GroupIterator implements Iterator<Student> {
    ArrayList<Student> group;
    private int index;
    public GroupIterator(ArrayList<Student> group) {
        this.group = group;
    }

    @Override
    public boolean hasNext() {
        return index < group.size();
    }

    @Override
    public Student next() {
        return group.get(index++);
    }

    @Override
    public void remove() {
        group.remove(index);
    }
}
