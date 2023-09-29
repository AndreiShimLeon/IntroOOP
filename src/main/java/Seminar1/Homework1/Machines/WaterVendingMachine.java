package Seminar1.Homework1.Machines;

import Seminar1.Homework1.Products.BottleOfWater;
import Seminar1.Homework1.Products.Product;

import java.util.ArrayList;

public class WaterVendingMachine implements VendingMachine {

    ArrayList<BottleOfWater> machine = new ArrayList<>();
    @Override
    public void initProducts(ArrayList<Product> list) {
        for (int i = 0; i < list.size(); i++) {
            this.machine.add((BottleOfWater) list.get(i));
        }

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

    public Product getProductByVolume(int volume) {
        for (int i = 0; i < machine.size(); i++) {
            if(machine.get(i).getVolume() == volume){
                return machine.get(i);
            }
        }
        return null;
    }
}
