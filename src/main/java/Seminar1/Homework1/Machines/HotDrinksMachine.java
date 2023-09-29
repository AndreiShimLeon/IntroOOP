package Seminar1.Homework1.Machines;

import Seminar1.Homework1.Products.HotDrink;
import Seminar1.Homework1.Products.Product;

import java.util.ArrayList;

public class HotDrinksMachine extends WaterVendingMachine implements VendingMachine{

    ArrayList<HotDrink> machine = new ArrayList<>();

    public HotDrink getProduct(String name, int cost, int temperature){

        for (int i = 0; i < this.machine.size(); i++) {
            if(machine.get(i).getName().toLowerCase().equals(name.toLowerCase()) &&
                    machine.get(i).getCost() == cost &&
                    machine.get(i).getTempreture() == temperature){
                return machine.get(i);
            }
        }
        return null;
    }

    public void initProducts(ArrayList<Product> list) {
        for (int i = 0; i < list.size(); i++) {
            this.machine.add((HotDrink) list.get(i));
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
    public Product getProductByTemperature(int temperature) {
        for (int i = 0; i < machine.size(); i++) {
            if(machine.get(i).getTempreture() == temperature){
                return machine.get(i);
            }
        }
        return null;
    }

}
