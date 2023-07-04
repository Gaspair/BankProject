package account;

import java.util.UUID;

public abstract class Account implements IAccount {
    private UUID accountId;
    private double funds;
    private String accountType;

    public Account(double funds, String accountType) {
        accountId = UUID.randomUUID();
        setFunds(funds);
        setAccountType(accountType);

    }

    public String getAccountType() {
        return accountType;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    public void depositFunds(double amount) {
    }
    public void withdrawFunds(double amount) {
    }
    public void transferFunds() {
    }
    public UUID getAccountId() {
        return accountId;
    }
    public double getFunds() {
        return funds;
    }
    public void setFunds(double funds) {
        this.funds = funds;
    }


}

