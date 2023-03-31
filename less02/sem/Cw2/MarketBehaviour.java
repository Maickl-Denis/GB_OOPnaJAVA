package GB_OOPnaJAVA.less02.sem.Cw2;

import GB_OOPnaJAVA.less02.sem.Cw1.Actor;

import java.util.List;

public interface MarketBehaviour {
    public void acceptToMarket(Actor actor);
    public void releaseFromMarket(Actor actor);
    public void update();
}
