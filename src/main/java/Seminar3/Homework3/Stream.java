package Seminar3.Homework3;

import java.util.ArrayList;
import java.util.Iterator;

public class Stream implements Iterator<StudyGroup> {
    private int index;
    private int id = 1;
    private static int idCounter;

    public int getId() {
        return id;
    }

    private ArrayList<StudyGroup> stream;

    public ArrayList<StudyGroup> getStream() {
        return stream;
    }

    public void setStream(ArrayList<StudyGroup> stream) {
        this.stream = stream;
        this.id = idCounter++;
    }
    public Stream(ArrayList<StudyGroup> studyGroups) {
        this.stream = studyGroups;
    }


    @Override
    public boolean hasNext() {
        return index < stream.size();
    }

    @Override
    public StudyGroup next() {
        return stream.get(index++);
    }

    @Override
    public void remove() {
        stream.remove(index);
    }

    @Override
    public String toString() {
        return "Stream"+
                " \n" + stream +
                '\n';
    }
}
