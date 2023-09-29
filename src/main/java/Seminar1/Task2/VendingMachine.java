package Seminar1.Task2;

import java.util.ArrayList;

public interface VendingMachine {
    ArrayList<Product> machine = null;

    public void initProducts (ArrayList<Product> list);
//    {    this.machine = list;
//        System.out.println(machine);
//    }

//    public boolean addProduct();
//    {
//        Product product = new Product(name, cost);
//        return machine.add(product);
//    }

    public Product getProductByName(String name);
//    {
//        for (int i = 0; i < machine.size(); i++) {
//            if(machine.get(i).getName().toLowerCase().equals(name.toLowerCase())){
//                return machine.get(i);
//            }
//        }
//        return null;
//    }

    public Product getProductByCost(int cost);
//    {
//        for (int i = 0; i < machine.size(); i++) {
//            if(machine.get(i).getCost() == cost){
//                return machine.get(i);
//            }
//        }
//        return null;
//    }
}