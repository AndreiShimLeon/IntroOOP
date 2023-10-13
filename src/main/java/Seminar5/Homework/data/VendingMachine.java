package Seminar5.Homework.data;

import java.util.ArrayList;

public interface VendingMachine <T extends Product>{



    public void initProducts (ArrayList<? extends T> list);

    public void setNewProducts (ArrayList<? extends T> list);

    public boolean contains(String name);

}