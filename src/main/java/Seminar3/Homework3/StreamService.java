package Seminar3.Homework3;

import java.util.ArrayList;

public class StreamService {

    public static void sortSize(StreamIterator stream){
        ArrayList<GroupIterator> list = stream.getGroups();
        list.sort(new StreamComparator().reversed());
    }

}
