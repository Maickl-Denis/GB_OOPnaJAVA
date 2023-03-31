package GB_OOPnaJAVA.less02.sem.Cw1;

public abstract class Actor implements ActorBehavoir{
    protected String name;
    protected boolean makeOrder;
    protected boolean takeOrder;
    public boolean isMakeOrder(){
        return makeOrder;
    };
    public boolean isTakeOrder(){
        return takeOrder;
    };

    public abstract String getName();
}
