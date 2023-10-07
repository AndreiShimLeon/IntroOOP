package Seminar3.Homework3;

import java.util.ArrayList;

public class StreamService {
    ArrayList<Stream> streams;

    public StreamService(ArrayList<Stream> streams) {
        this.streams = streams;
    }

    public void sortStream(){
        this.streams.sort(new StreamComparator());
    }
}
