package Seminar1.Task2;

import java.util.ArrayList;

public interface VendingMachine {
    ArrayList<Product> machine = null;

    public void initProducts (ArrayList<Product> list);

    public Product getProductByName(String name);

    public Product getProductByCost(int cost);

}