package Seminar1.Homework1.Machines;

import Seminar1.Homework1.Products.Product;

import java.util.ArrayList;

public interface VendingMachine {
    ArrayList<Product> machine = null;

    public void initProducts (ArrayList<Product> list);

    public Product getProductByName(String name);

    public Product getProductByCost(int cost);

}