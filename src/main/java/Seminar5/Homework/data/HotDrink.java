package Seminar5.Homework.data;

public class HotDrink extends Water {
    private int temperature;
    private final int id;
    private static int idCounter =1;
    public HotDrink(String name, int cost, int volume, int temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
        this.id = idCounter++;
    }

    @Override
    public int getId() {
        return id;
    }

    public int getTempreture() {
        return temperature;
    }

    public void setTempreture(int tempreture) {
        this.temperature = tempreture;
    }

    @Override
    public String toString() {
        return  name + ", cost" + cost+ ", volume: " + volume + ", temperature: " + temperature;
    }
}
