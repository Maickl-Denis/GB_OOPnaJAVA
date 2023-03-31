package GB_OOPnaJAVA.less02.sem.Cw1;

public class Human extends Actor{
    @Override
    public void setMakeOrder() {
        makeOrder=true;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setTakeOrder() {
        takeOrder=true;
    }
}
