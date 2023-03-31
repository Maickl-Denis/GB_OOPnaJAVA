package GB_OOPnaJAVA.less02.sem.Cw2;

import GB_OOPnaJAVA.less02.sem.Cw1.Actor;
import GB_OOPnaJAVA.less02.sem.Cw1.Human;

/**
 * 1. Интерфейс QueueBehaviour, который описывает логику очереди – помещение в/освобождение из очереди, принятие/отдача заказа
 * 2. Интерфейс MarketBehaviour, который описывает логику магазина – приход/уход покупателей, обновление состояния магазина
 * 3. Класс Market, который реализовывает два вышеуказанных интерфейса и хранит в списке список людей в очереди в различных статусах
 */
public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Market mac = new Market();
        mac.acceptToMarket(human);
        mac.takeInQueue(human);
        mac.takeOrders();
        mac.giveOrders();
        mac.releaseFromQueue();
        mac.releaseFromMarket(human);

    }
}
