package Seminar3.Homework3;


import java.util.ArrayList;
import java.util.Iterator;

public class Stream implements Iterable<GroupIterator>{
    private ArrayList<GroupIterator> groups = new ArrayList<>();

    public ArrayList<GroupIterator> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<GroupIterator> groups) {
        this.groups = groups;
    }

    @Override
    public Iterator<GroupIterator> iterator() {
        return new StreamIterator();
    }
}
