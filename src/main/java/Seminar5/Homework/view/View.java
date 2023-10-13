package Seminar5.Homework.view;

import Seminar5.Homework.controller.HotDrinksMachineController;
import Seminar5.Homework.controller.WaterVendingMachineController;
import Seminar5.Homework.data.HotDrink;
import Seminar5.Homework.data.HotDrinksMachine;
import Seminar5.Homework.data.Water;
import Seminar5.Homework.data.WaterVendingMachine;

import java.util.ArrayList;

public class View {
    private WaterVendingMachineController<Water> waterVendingMachineController;
    private HotDrinksMachineController<HotDrink> hotDrinksMachineController;

    public View() {
        this.waterVendingMachineController = new WaterVendingMachineController<>();
        this.hotDrinksMachineController = new HotDrinksMachineController<>();
    }

    public void setWaters(ArrayList<Water> list) {
        waterVendingMachineController.setNewProducts(list);
        System.out.println("Waters list have been added to the water machine");
    }

    public void setHotDrinks(ArrayList<HotDrink> list) {
        hotDrinksMachineController.setNewProducts(list);
        System.out.println("Hot drinks list have been added to the water machine");
    }

    public void viewAllWaters() {
        for (Water water : waterVendingMachineController.getAllProducts()
        ) {
            String S = "Water [" + water.getId() + "] " + water.getName() + ", cost: " + water.getCost() + "rub, volume: " + water.getVolume() + " ml.";
            System.out.println(S);
        }
    }

    public void viewALlHotDrinks() {
        for (HotDrink drink : hotDrinksMachineController.getAllProducts()
        ) {
            String S = "Hot drink [" + drink.getId() + "] " + drink.getName() + ", cost: " + drink.getCost() + "rub, volume: " + drink.getVolume() + " ml." + drink.getTempreture() + "C.";
            System.out.println(S);
        }
    }

    public void getWater(String name, int cost, int volume) {
        if (waterVendingMachineController.getMachine().contains(name)) {
            Water temp = waterVendingMachineController.getProduct(name, cost, volume);
            if (temp != null) System.out.println("Here is your " + temp.getName() + ". Enjoy!");
            else System.out.println("Please choose another cost/volume.");
        } else {
            System.out.println("This product isn't presented in this machine");
        }
    }

    public void getHotDrink(String name, int cost, int volume, int temperature) {
        if (hotDrinksMachineController.getMachine().contains(name)) {
            Water temp = hotDrinksMachineController.getProduct(name, cost, volume,temperature);
            if (temp != null) System.out.println("Here is your " + temp.getName() + ". Enjoy!");
            else System.out.println("Please choose another cost/volume/temperature.");
        } else {
            System.out.println("This product isn't presented in this machine");
        }
    }

    public void addWater(String name, int cost, int volume){
        this.waterVendingMachineController.addProduct(new Water(name, cost, volume));
        System.out.println("new " + name + " has been added to water machine");
    }

    public void addHotDrink(String name, int cost, int volume, int temperature){
        this.hotDrinksMachineController.addProduct(new HotDrink(name, cost, volume, temperature));
        System.out.println("new " + name + " has been added to hot drinks machine");
    }

    public void viewContainsWater(String name) {
        if (waterVendingMachineController.getMachine().contains(name)) {
            System.out.println(name+ " is presented. Please choose variants:");
            for (Water water : waterVendingMachineController.getAllProducts()
            ) {
                if (water.getName().equalsIgnoreCase(name)) System.out.println("\t"+water);
            }
        } else System.out.println("Machine doesn't have this product");
    }

    public void viewContainsHotDrink(String name) {
        if (hotDrinksMachineController.getMachine().contains(name)) {
            System.out.println(name+ " is presented. Please choose variants:");
            for (HotDrink drink : hotDrinksMachineController.getAllProducts()
            ) {
                if (drink.getName().equalsIgnoreCase(name)) System.out.println("\t"+drink);
            }
        } else System.out.println("Machine doesn't have this product");
    }
}
