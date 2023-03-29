package GB_OOPnaJAVA.less01.sem.Cw2;

import java.util.List;

public class HotDrinksMachine implements Machine{
    private final List<Product> products;
    public HotDrinksMachine(List<Product> products) {
        this.products = products;
    }

    public Product getProduct(String name){
        for(Product product: products){
            if(product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }

    public HotDrinks getProduct(String name, int volume,  int temperature){
        for(Product product: products){
            if(product instanceof HotDrinks){
                if(product.getName().equalsIgnoreCase(name) && ((HotDrinks) product).getVolume() == volume
                        && ((HotDrinks) product).getTemperature() == temperature){
                    return (HotDrinks) product;
                }
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }

}






