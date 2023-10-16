package Seminar6.Task;

abstract class Bird implements CanFly{
    @Override
    public void fly() {}
}
class Ostrich extends Bird implements Runnable{
    @Override
    public void run() {
        System.out.println();
    }

}

class Main{
    public static void main(String[] args) {
        Ostrich ostrich = new Ostrich();
        ostrich.fly();
    }
}