package GB_OOPnaJAVA.less01.sem.Cw2;


public class HotDrinks extends Product {
    private Integer temperature;
    private Integer volume;

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Integer getVolume() {
        return volume;
    }

    public HotDrinks(String name, Integer volume, Integer temperature, Double price) {
        super(name, price);
        this.temperature = temperature;
        this.volume = volume;
    }


    @Override
    public String toString() {
        return "Hot_drinks{" +
                "name = " + getName() + ", " +
                "price = " + getPrice() + ", " +
                "temperature = " + temperature + ", " +
                "volume = " + volume +
                '}';
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
