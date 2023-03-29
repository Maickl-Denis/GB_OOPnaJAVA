package GB_OOPnaJAVA.less01.sem.Cw2;

import java.util.ArrayList;
import java.util.List;
// создать перегруженный метод выдачи товара ТорговымАвтоматом дополнив
// дополнительным входным параметром (пример: getProduct(String name)
// выдающий товар по имени, создать метод возвращающий товар по имени
// и какому-либо параметру товара getProduct(String name, int volume) (10 минут)

//Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
// содержащий в себе методы initProducts (List <Product>) сохраняющий
// в себе список исходных продуктов и getProduct(String name)

// Сделать класс Товар абстрактным, создать нескольких наследников
// (к примеру: БутылкаВоды), сделать интерфейсом ТорговыйАвтомат и реализовать
// класс какого-то одного типа ТорговогоАвтомата (пример: ПродающийБутылкиВодыАвтома

/**
 * ДЗ
 * 1. Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
 * 2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный
 * метод getProduct(int name, int volume, int temperature) выдающий продукт соответствующий имени, объему и температуре
 * 3. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику
 * заложенную в программе
 * 4. Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
 */
public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList();
        list.add(new Water("water 0.5l", 300.0, 300));
        list.add(new Water("water 1l", 200.0, 200));
        BottleOfWaterVendingMachine machine = new BottleOfWaterVendingMachine(list);

        Water water = machine.getProduct("water 0.5l", 300);

        System.out.println(machine.getProduct("water 0.5l", 300));


//ДЗ
        List<Product> list1 = new ArrayList();
        list1.add(new HotDrinks("Coffee", 250, 45, 100.0));
        list1.add(new HotDrinks("Tea", 350, 65, 75.0));
        HotDrinksMachine machine1 = new HotDrinksMachine(list1);

        HotDrinks water1 = machine1.getProduct("Coffee", 250, 45);
        System.out.println(water1);




    }
}
