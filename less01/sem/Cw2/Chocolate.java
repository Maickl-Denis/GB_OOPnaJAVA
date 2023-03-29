package GB_OOPnaJAVA.less01.sem.Cw2;

public class Chocolate extends Product{

    private Integer sugar;

    public Integer getSugar() {
        return sugar;
    }

    public void setSugar(Integer sugar) {
        this.sugar = sugar;
    }

    public Chocolate(String name, Double price, Integer sugar) {
        super(name, price);
        this.sugar = sugar;
    }

    public Chocolate(String name, Double price) {
        super(name, price);
    }

}
