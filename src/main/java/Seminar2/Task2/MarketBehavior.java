package Seminar2.Task2;

 interface QueueBehavior {
    void takeInQueue(Actor actor);
    void takeOrders();
    void giveOrders();
    void releaseFromQueue();
}
