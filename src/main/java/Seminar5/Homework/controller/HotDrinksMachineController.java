package Seminar5.Homework.controller;

import Seminar5.Homework.data.HotDrink;
import Seminar5.Homework.data.HotDrinksMachine;
import Seminar5.Homework.data.Water;
import Seminar5.Homework.data.WaterVendingMachine;

import java.util.ArrayList;

public class HotDrinksMachineController<T extends HotDrink> extends WaterVendingMachine<T> {

    private final HotDrinksMachine<T> machine;

    public HotDrinksMachine<T> getMachine() {
        return machine;
    }

    public HotDrinksMachineController(ArrayList<T> initialDrinks) {
        this.machine = new HotDrinksMachine<T>();
        this.machine.initProducts(initialDrinks);
    }
    public HotDrinksMachineController() {
        this.machine = new HotDrinksMachine<T>();
    }

    @Override
    public void setNewProducts(ArrayList<? extends T> list) {
        this.machine.setNewProducts(list);
    }

    public ArrayList<T> getAllProducts() {
        return (ArrayList<T>) this.machine.getProducts();
    }

    public void addProduct(T product){
        this.machine.addProduct(product);
    }

    public T getProduct(String name, int cost, int volume, int temperature) {
        return (T) this.machine.getProduct(name, cost, volume, temperature);
    }
}
