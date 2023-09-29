package Seminar1.Task1;

import java.util.ArrayList;

public class VendingMachine {
    ArrayList<Product> machine;

    public boolean addProduct(String name, int cost){
        Product product = new Product(name, cost);
        return machine.add(product);
    }

    public Product getProductByName(String name){
        for (int i = 0; i < machine.size(); i++) {
            if(machine.get(i).getName().toLowerCase().equals(name.toLowerCase())){
                return machine.get(i);
            }
        }
        return null;
    }

    public Product getProductByCost(int cost){
        for (int i = 0; i < machine.size(); i++) {
            if(machine.get(i).getCost() == cost){
                return machine.get(i);
            }
        }
        return null;
    }

    public void initProducts(ArrayList<Product> list) {
        this.machine = list;
    }
}