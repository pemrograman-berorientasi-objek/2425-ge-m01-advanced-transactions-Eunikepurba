package fintech.model;
import java.util.Comparator;

/**
 * @author 12S23041 - Lisbeth Panjaitan
 * @author 12S23021 - Eunike Purba
 */


public class AccountComparator implements Comparator<Account> {
    public int compare(Account a1, Account a2) {
        return a1.getAccountName().compareTo(a2.getAccountName());
    }
}

