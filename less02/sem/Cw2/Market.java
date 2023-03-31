package GB_OOPnaJAVA.less02.sem.Cw2;

import GB_OOPnaJAVA.less02.sem.Cw1.Actor;

import java.util.*;

public class Market implements QueueBehaviour, MarketBehaviour{
    List<Actor> mylistq = new ArrayList<>();
    Queue<Actor> myque = new LinkedList<>();


    @Override
    public void acceptToMarket(Actor actor) {
        mylistq.add(actor);
    }

    @Override
    public void releaseFromMarket(Actor actor) {
        mylistq.remove(actor);
    }

    @Override
    public void update() {

    }

    @Override
    public void takeInQueue(Actor actor) {
        myque.add(actor);
    }

    @Override
    public void takeOrders() {
        myque.peek().setTakeOrder();

    }

    @Override
    public void giveOrders() {
        myque.peek().setMakeOrder();
    }

    @Override
    public void releaseFromQueue() {
        myque.poll();
    }
}
