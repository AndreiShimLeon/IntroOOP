package Seminar2.Task2;

import java.util.List;

interface MarketBehavior {
    void acceptToMarket(Actor actor);
    void releaseFromMarket(List<Actor> actors);
    void update();
}
