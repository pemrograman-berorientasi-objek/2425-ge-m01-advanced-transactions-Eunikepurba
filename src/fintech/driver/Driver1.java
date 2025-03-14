package fintech.driver; 

import java.util.Scanner; 
import fintech.model.*;

/**
 * @autor 12S23041- Lisbeth Panjaitan
 * @autor 12S23021- Eunike Purba
 */

public class Driver1 {

    public static void main(String[] _args) {

        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String accountName = scanner.nextLine();
        String accountOwner = scanner.nextLine();

        Account newAccount = new Account(accountOwner, accountName);
        System.out.println(newAccount);

        command = scanner.nextLine();
        String transactionAccount = scanner.nextLine();
        double transactionAmount = Double.parseDouble(scanner.nextLine());
        String transactionDate = scanner.nextLine();
        String transactionNote = scanner.nextLine();

        Transaction newTransaction = new Transaction(transactionAccount, transactionAmount, transactionDate, transactionNote);
        System.out.println(newTransaction);

        scanner.close();
    }
}