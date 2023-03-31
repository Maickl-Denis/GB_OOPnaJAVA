package GB_OOPnaJAVA.less02.sem.Cw2;

import GB_OOPnaJAVA.less02.sem.Cw1.Actor;

public interface QueueBehaviour {
    public void takeInQueue(Actor actor);
    public void takeOrders();
    public void giveOrders();
    public void releaseFromQueue();
}
