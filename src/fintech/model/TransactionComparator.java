package fintech.model;
/**
 * @author 12S23041 - Lisbeth Panjaitan
 * @author 12S23021 - Eunike Purba
 */

import java.util.Comparator;


public class TransactionComparator implements Comparator<Transaction> {
    public int compare(Transaction t1, Transaction t2) {
        return t1.getPosted_at().compareTo(t2.getPosted_at());
    }
}
