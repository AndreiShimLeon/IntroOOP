package Seminar1.Task2;

import java.util.ArrayList;

public class WaterVendingMachine implements VendingMachine{

    ArrayList<Product> machine;
    @Override
    public void initProducts(ArrayList<Product> list) {
        this.machine = list;
    }

    @Override
    public Product getProductByName(String name) {
        for (int i = 0; i < this.machine.size(); i++) {
            if(machine.get(i).getName().toLowerCase().equals(name.toLowerCase())){
                return machine.get(i);
            }
        }
        return null;
    }

    @Override
    public Product getProductByCost(int cost) {
                for (int i = 0; i < machine.size(); i++) {
            if(machine.get(i).getCost() == cost){
                return machine.get(i);
            }
        }
        return null;
    }
}
