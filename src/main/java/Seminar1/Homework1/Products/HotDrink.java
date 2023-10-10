package Seminar1.Homework1.Products;

public class HotDrink extends BottleOfWater{
    int temperature;
    public HotDrink(String name, int cost, int volume, int tempreture) {
        super(name, cost, volume);
        this.temperature = tempreture;
    }

    public int getTempreture() {
        return temperature;
    }

    public void setTempreture(int tempreture) {
        this.temperature = tempreture;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "temperature=" + temperature +
                "} " + super.toString();
    }
}

