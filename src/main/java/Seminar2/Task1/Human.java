package Seminar2.Task1;

import static Seminar2.Task1.ActorBehavior.isMakeOrder;

public class Human extends Actor{
    @Override
    public String toString() {
        return "Did human " +
                "\'" + name + "\' "+
                "make an order? " + isMakeOrder +
                " Did this human take his order? " + isTakeOrder +
                " " + super.toString();
    }
}
