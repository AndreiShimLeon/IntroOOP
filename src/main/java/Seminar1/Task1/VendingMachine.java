package Seminar1.Task1;

import java.util.ArrayList;

public class VendingMachine {
    ArrayList<Product> machine;

    public boolean addProduct(String name, int cost){
        Product product = new Product();
        product.setName(name);
        product.setCost(cost);
        return machine.add(product);
    }

    public Product getProductByName(String name){
        return machine.contains();
    }

    public Product getProductByCost(int cost){
        return machine.contains();
    }
}
