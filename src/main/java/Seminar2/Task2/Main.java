package Seminar2.Task2;

import static Seminar2.Task2.Market.clients;

public class Main {
    public static void main(String[] args) {
        Market store = new Market();
        Human george = new Human();
        george.setName("George");
        Human maria = new Human();
        maria.setName("Maria");
        Human paul = new Human();
        paul.setName("Paul");
        Human ralph = new Human();
        ralph.setName("Ralph");
        Human andrew = new Human();
        andrew.setName("Andrew");

        store.acceptToMarket(george);
        store.takeInQueue(george);
        store.update();

        store.acceptToMarket(maria);
        store.acceptToMarket(paul);
        store.acceptToMarket(ralph);
        store.acceptToMarket(andrew);
        store.takeInQueue(maria);
        store.takeInQueue(paul);
        store.takeInQueue(ralph);
        store.update();
        store.update();
        store.releaseFromMarket(clients);


    }
}
