package Seminar3.Homework3;

import java.util.ArrayList;
import java.util.Iterator;

public class StreamIterator implements Iterator<GroupIterator> {
    ArrayList<GroupIterator> stream = new ArrayList<>();

    public StreamIterator(ArrayList<GroupIterator> stream) {
        this.stream = stream;
    }

    public ArrayList<GroupIterator> getGroups() {
        return stream;
    }

    public void setGroups(ArrayList<GroupIterator> groups) {
        this.stream = groups;
    }

    int index;

    public StreamIterator() {
    }

    @Override
    public boolean hasNext() {
        return index < stream.size();
    }

    @Override
    public GroupIterator next() {
        if(hasNext()){
            return stream.get(index++);
        }
        throw new ExceptionInInitializerError();
    }

    @Override
    public String toString() {
        String s = "\n Stream"+ "\n";
        for (GroupIterator group: stream){
            s+='\t'+group.toString() + '\n';
        }
        return s;
    }
}

