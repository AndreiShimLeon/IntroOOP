package Seminar1.Homework1.Products;



public class BottleOfWater extends Product {
    int volume;

    public BottleOfWater(String name, int cost, int volume) {
        super(name, cost);
        this.volume = volume;
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "BottleOfWater{" +
                "volume=" + volume +
                "} " + super.toString();
    }
}

