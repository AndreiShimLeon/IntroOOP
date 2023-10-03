package Seminar1.Homework1;

import Seminar1.Homework1.Machines.HotDrinksMachine;
import Seminar1.Homework1.Machines.VendingMachine;
import Seminar1.Homework1.Machines.WaterVendingMachine;
import Seminar1.Homework1.Products.BottleOfWater;
import Seminar1.Homework1.Products.HotDrink;
import Seminar1.Homework1.Products.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product cola1 = new BottleOfWater("Cola", 55, 300);
        Product pepsi1 = new BottleOfWater("Pepsi", 12, 300);
        Product pepsi2 = new BottleOfWater("Pepsi", 102, 2000);
        Product cola2 = new BottleOfWater("Cola", 35,500);
        Product stillWater = new BottleOfWater("Water", 78, 500);
        Product milk = new BottleOfWater("Milk", 18, 1000);

        ArrayList<Product> startProducts = new ArrayList<>(List.of(cola1, pepsi1, pepsi2, cola2, stillWater, milk));
        VendingMachine machine = new WaterVendingMachine();
        machine.initProducts(startProducts);

        System.out.println(machine.getProductByName("pepsi"));
        System.out.println(machine.getProductByName("pepsu"));
        System.out.println(machine.getProductByName("Water"));
        System.out.println(machine.getProductByCost(35));
        System.out.println(((WaterVendingMachine) machine).getProductByVolume(1000));
        System.out.println(((WaterVendingMachine) machine).getProductByVolume(700));

        System.out.println("--".repeat(100));

        Product espresso50 = new HotDrink("espresso", 22, 50, 60);
        Product espresso100 = new HotDrink("espresso", 33, 50, 100);
        Product latte300 = new HotDrink("latte", 60, 300, 50);
        Product latte500 = new HotDrink("latte", 90, 500, 50);
        Product cappu300 = new HotDrink("cappuccino", 65, 300, 55);
        Product cappu500 = new HotDrink("cappuccino", 95, 500, 55);


        ArrayList<Product> hotDrinks = new ArrayList<>(List.of(espresso50,espresso100,latte500,latte300,cappu500,cappu300));
        VendingMachine hotMachine = new HotDrinksMachine();
        hotMachine.initProducts(hotDrinks);

        System.out.println(hotMachine.getProductByName("espresso"));
        System.out.println(hotMachine.getProductByName("latte"));
        System.out.println(hotMachine.getProductByName("raf"));
        System.out.println(hotMachine.getProductByCost(60));
        System.out.println(hotMachine.getProductByCost(62));
        System.out.println(((HotDrinksMachine) hotMachine).getProductByVolume(1000));
        System.out.println(((HotDrinksMachine) hotMachine). getProductByTemperature(55));
        System.out.println(((HotDrinksMachine) hotMachine). getProductByTemperature(100));

        System.out.println("--".repeat(100));

    }
}

