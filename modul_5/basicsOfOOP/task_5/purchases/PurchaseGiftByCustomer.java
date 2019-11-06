package modul_5.basicsOfOOP.task_5.purchases;

import modul_5.basicsOfOOP.task_5.entity.Gift;
import modul_5.basicsOfOOP.task_5.entity.Purchase;
import modul_5.basicsOfOOP.task_5.entity.sweets.*;

public class PurchaseGiftByCustomer  implements Customer{

    @Override
    public Purchase getPurchase() {

        Gift gift= new Gift();
        gift.add(new Bounty());
        gift.add(new Haribo());
        gift.add(new Kinder());
        gift.add(new Mars());
        gift.add(new Snickers());
        gift.add(new Twix());

        return gift;
    }
}
