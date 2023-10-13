package Seminar5.Homework.data;

public class Water extends Product {
    protected int volume;
    private final int id;
    private static int idCounter=1;

    public Water(String name, int cost, int volume) {
        super(name, cost);
        this.volume = volume;
        this.id= idCounter++;
    }

    public int getId() {
        return this.id;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return name + ", cost" + cost+ ", volume: " + volume;
    }
}
