package Seminar2.Task2;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Market implements MarketBehavior, QueueBehavior{

    static ArrayList<Actor> clients = new ArrayList<>(); // посетители магазина
    Queue<Actor> queue = new ArrayDeque<>(); // очередь за заказом
    @Override
    public void takeInQueue(Actor actor) {
        if(clients.contains(actor)) {
            System.out.print(actor.getName() + " stands in the queue. ");
            queue.add(actor);
            System.out.println("The queue has increased to size of " + queue.size());
            clients.remove(actor);
        }
    }

    @Override
    public void takeOrders() {
        if(queue.peek() != null) {
            queue.peek().isMakeOrder = true;
            System.out.println(queue.peek().getName() + " has made an order");
        }
    }

    @Override
    public void giveOrders() {
        if(queue.peek() != null) {
            queue.peek().isTakeOrder = true;
            System.out.println(queue.peek().getName() + " has taken the order");
            releaseFromQueue();
        }
    }

    @Override
    public void releaseFromQueue() {
        System.out.print(queue.peek().getName() + " is leaving the queue. ");
        clients.add(queue.poll());
        System.out.print(queue.size() + " clients ");
        System.out.print(queue.toString());
        System.out.println(" left standing in the queue.");

    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.print(actor.getName() + " is entering to the Market. ");
        clients.add(actor);
        System.out.println("Total number of people in the Market: " + (clients.size()+queue.size()));
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (int i = 0; i < actors.size(); i++) {
            if(actors.get(i).isTakeOrder) {
                System.out.print(actors.get(i).getName() + " is leaving the Market. ");
                actors.remove(actors.get(i));
                System.out.println("Total number of people in the Market: " + (clients.size()+queue.size()));
            }
        }
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
    }
}
