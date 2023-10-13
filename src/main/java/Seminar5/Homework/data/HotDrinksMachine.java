package Seminar5.Homework.data;

import java.util.ArrayList;

public class HotDrinksMachine<T extends HotDrink> extends WaterVendingMachine<T>{

//    private ArrayList<HotDrink> hotDrinks = new ArrayList<>();


    public HotDrinksMachine() {
        this.products = new ArrayList<T>();
    }

    public HotDrink getProduct(String name, int cost, int volume, int temperature){

        for (int i = 0; i < this.products.size(); i++) {
            if(products.get(i).getName().equalsIgnoreCase(name) &&
                    products.get(i).getCost() == cost &&
                    products.get(i).getVolume() == volume &&
                    products.get(i).getTempreture() == temperature){
                return products.get(i);
            }
        }
        return null;
    }

    public HotDrink getProductByTemperature(int temperature) {
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getTempreture() == temperature){
                return products.get(i);
            }
        }
        return null;
    }

//    public ArrayList<HotDrink> getProducts() {
//        return (ArrayList<HotDrink>) products;
//    }
}
