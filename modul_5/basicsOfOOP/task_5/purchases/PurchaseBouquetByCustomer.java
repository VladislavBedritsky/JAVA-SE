package modul_5.basicsOfOOP.task_5.purchases;

import modul_5.basicsOfOOP.task_5.entity.Bouquet;
import modul_5.basicsOfOOP.task_5.entity.Purchase;
import modul_5.basicsOfOOP.task_5.entity.flowers.*;

public class PurchaseBouquetByCustomer implements Customer {

    @Override
    public Purchase getPurchase() {

        Bouquet bouq = new Bouquet();
        bouq.add(new Rose());
        bouq.add(new Archidea());
        bouq.add(new Chamomile());
        bouq.add(new Chrysanthemum());
        bouq.add(new Lily());
        bouq.add(new Tulip());

        return bouq;
    }
}
