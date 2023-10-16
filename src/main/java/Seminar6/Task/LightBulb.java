package Seminar6.Task;

public class LightBulb {
    public void turnOn(){
        // включение лампочки
    }

    public void turnOff(){
        // выключение лампочки
    }
}

class Switch{
    private LightBulb bulb;

    public Switch(){
        this.bulb = new LightBulb();
    }

    public void operate(){
        // работа с выключателем
        bulb.turnOn();
    }
}
