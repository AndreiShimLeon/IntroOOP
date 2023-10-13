package Seminar5.Homework.data;

import java.util.ArrayList;

public class WaterVendingMachine<T extends Water> implements VendingMachine<T> {
    protected ArrayList<T> products = new ArrayList<>();

    @Override
    public void initProducts(ArrayList<? extends T> list) {
        this.products.addAll(list);
    }

    @Override
    public void setNewProducts(ArrayList<? extends T> list) {
        this.products.clear();
        initProducts(list);
    }

    public void addProduct(T product){
        this.products.add(product);
    }

    public boolean contains(String name){
        for (int i = 0; i < this.products.size(); i++) {
            if(products.get(i).getName().equalsIgnoreCase(name)) return true;
        }
        return false;
    }


    public ArrayList<? extends Water> getProducts() {
        return products;
    }

    public Water getProduct(String name, int cost, int volume) {
        for (int i = 0; i < this.products.size(); i++) {
            if(products.get(i).getName().equalsIgnoreCase(name) &&
            products.get(i).getCost()==cost &&
            products.get(i).getVolume()==volume){
                return products.get(i);
            }
        }
        return null;
    }

}