package account;

import java.util.UUID;

public class Account {
    private UUID accountId;

    private double funds;
    private String accountType;


    public Account(double funds, String accountType) {
        this.accountId = UUID.randomUUID();
        setFunds(funds);
        setAccountType(accountType);

    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String depositFunds(double amount) {
        setFunds(amount + getFunds());

        return "The amount of " + amount + " was deposited to account:" + getAccountId() + ".New sold is: " + getFunds()+ ".";
    }

    public String withdrawFunds(double amount) {
        setFunds(getFunds() - amount);
        return "The amount of " + amount + " was deposited to account:" + getAccountId() + ".New sold is: " + getFunds()+ ".";
    }

    public String transferFunds(double amount, Account receiver) {
        this.setFunds(getFunds() - amount);
        receiver.setFunds(receiver.getFunds() + amount);
        return "The amount of " + amount + " was transferred from account:" + getAccountId() + ", to account:"+receiver.getAccountId()+ ".Remaining funds of: " + getFunds()+ ".";
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
