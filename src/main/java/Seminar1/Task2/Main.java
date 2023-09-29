package Seminar1.Task2;

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
        System.out.println(machine.getProductByCost(11));
    }
}