package Seminar5.Homework;

import Seminar5.Homework.data.*;
import Seminar5.Homework.data.Water;
import Seminar5.Homework.view.View;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void regionSeparator(){
        System.out.println("***".repeat(25));;
    }
    
    public static void separator(){
        System.out.println("---".repeat(25));;
        
    }
    public static void main(String[] args) {
        
        // Создаем список вод

        Water cola1 = new Water("Cola", 55, 300);
        Water pepsi1 = new Water("Pepsi", 12, 300);
        Water pepsi2 = new Water("Pepsi", 102, 2000);
        Water cola2 = new Water("Cola", 35, 500);
        Water stillWater = new Water("Water", 78, 500);
        Water milk = new Water("Milk", 18, 1000);

        ArrayList<Water> startProducts = new ArrayList<>(List.of(cola1, pepsi1, pepsi2, cola2, stillWater, milk));

        // Создаем список горячих напитков

        HotDrink espresso50 = new HotDrink("espresso", 22, 50, 60);
        HotDrink espresso100 = new HotDrink("espresso", 33, 50, 100);
        HotDrink latte300 = new HotDrink("latte", 60, 300, 50);
        HotDrink latte500 = new HotDrink("latte", 90, 500, 50);
        HotDrink cappu300 = new HotDrink("cappuccino", 65, 300, 55);
        HotDrink cappu500 = new HotDrink("cappuccino", 95, 500, 55);
        ArrayList<HotDrink> hotDrinks = new ArrayList<>(List.of(espresso50, espresso100, latte500, latte300, cappu500, cappu300));

        // создаем View

        View view = new View();

        // заводим списки во View
        view.setWaters(startProducts);
        separator();
        view.addWater("Water", 100, 1000);
        separator();
        view.setHotDrinks(hotDrinks);
        separator();
        view.addHotDrink("Hot Water", 10, 300, 100);
        regionSeparator();

        // просмотр всего содержимого View

        view.viewAllWaters();
        separator();
        view.viewALlHotDrinks();
        regionSeparator();

        // проверяем наличие продуктов:
        view.viewContainsWater("Cola");
        separator();
        view.viewContainsHotDrink("latte");
        separator();


        view.viewContainsWater("sprite"); //Machine doesn't have this product
        separator();
        view.viewContainsHotDrink("macchiato"); //Machine doesn't have this product
        regionSeparator();
        
        // Запрашиваем определенный продукт через View
        view.getWater("Water", 100, 1000);
        separator();
        view.getWater("Water", 100, 2000);
        separator();
        view.getWater("adrenaline", 100, 2000);
        separator();
        view.getHotDrink("latte", 60, 300, 50);
        separator();

        view.getHotDrink("Latte", 60, 777, 50);
        separator();
        view.getHotDrink("Biglatte", 60, 300, 50);


    }
}
