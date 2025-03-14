package fintech.model; 

/**
 * @author 12S23041 - Lisbeth Panjaitan
 * @author 12S23021 - Eunike Purba
 */
public class Account {
  private String owner;
  private String accountName;
  private double balance =0.0;

  public Account(String owner, String accountName) {
    this.owner = owner;
    this.accountName = accountName;
    this.balance = 0.0;
  }

  public String getOwner() {
    return this.owner;
  }

  public String getAccountName() {
    return this.accountName;
  }

  public double getBalance() {
    return this.balance;
  }

  public void addBalance(double amount) {
    this.balance += amount;
  }

    }
  
