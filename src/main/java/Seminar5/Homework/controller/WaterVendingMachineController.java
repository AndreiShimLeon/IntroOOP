package Seminar5.Homework.controller;


import Seminar5.Homework.data.HotDrink;
import Seminar5.Homework.data.Product;
import Seminar5.Homework.data.Water;
import Seminar5.Homework.data.WaterVendingMachine;

import java.util.ArrayList;

public class WaterVendingMachineController <T extends Water> {
     private final WaterVendingMachine<T> machine;

    public WaterVendingMachine<T> getMachine() {
        return machine;
    }

    public WaterVendingMachineController(ArrayList<T> initialWaters) {
        this.machine = new WaterVendingMachine<T>();
        this.machine.initProducts(initialWaters);
    }

    public WaterVendingMachineController() {
        this.machine = new WaterVendingMachine<T>();
    }

    public void setNewProducts(ArrayList<T> list){
        this.machine.setNewProducts(list);
    }

    public Water getProduct(String name, int cost, int volume){
        return this.machine.getProduct(name, cost,volume);
    }

    public void addProduct(T product){
        this.machine.addProduct(product);
    }

    public ArrayList<T> getAllProducts(){
        return (ArrayList<T>) this.machine.getProducts();
    }

}
