package Seminar4.Task1;

import java.util.List;

public abstract class  Group<T  extends User> {

    protected List<T> group;

    public Group(List<T> group) {
        this.group = group;
    }

    public List<T> getMemberList() {
        return group;
    }


    public void addGroupMember(T user) {
        group.add(user);
    }

    public void removeGroupMember(T user) {
        group.remove(user);
    }
}
