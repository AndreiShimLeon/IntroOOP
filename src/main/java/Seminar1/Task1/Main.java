package Seminar1.Task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product cola = new Product("Cola", 55);

        Product pepsi = new Product("pepsi", 12);
        Product junk = new Product("junk", 35);
        Product snick = new Product("snick", 78);
        Product now = new Product("now", 18);

        ArrayList<Product> startProducts = new ArrayList<>(List.of(cola, pepsi, junk, snick,now)); // добавление нескольких элементов в список
        VendingMachine machine = new VendingMachine();
        machine.initProducts(startProducts);

        System.out.println(machine.getProductByName("pepsi"));
        System.out.println(machine.getProductByName("pepsu"));
        System.out.println(machine.getProductByCost(35));
        System.out.println(machine.getProductByCost(11));
    }
}