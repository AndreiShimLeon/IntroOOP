package Seminar3.Homework3;

import java.util.ArrayList;
import java.util.Comparator;

public class StreamComparator implements Comparator<GroupIterator> {
    @Override
    public int compare(GroupIterator o1, GroupIterator o2) {
        return o2.getGroup().size() - o1.getGroup().size();
    }

    @Override
    public Comparator<GroupIterator> reversed() {
        return Comparator.super.reversed();
    }
}
