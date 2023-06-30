package account;

import java.util.UUID;

public class Account {
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
        setFunds(amount + getFunds());

        System.out.println("The amount of " + amount + " was deposited to account:" + getAccountId() + ".New sold is: " + getFunds() + ".");
    }

    public void withdrawFunds(double amount) {
        if (getFunds() <= amount) {
            System.out.println("Insufficient funds!");
        } else {
            setFunds(getFunds() - amount);
            System.out.println("The amount of " + amount + " was deposited to account:" + getAccountId() + ".New sold is: " + getFunds() + ".");
        }
    }

    public void transferFunds(double amount, @org.jetbrains.annotations.NotNull Account receiver) {
        this.setFunds(getFunds() - amount);
        receiver.setFunds(receiver.getFunds() + amount);
        System.out.println("The amount of " + amount + " was transferred from account:" + getAccountId() + ", to account:" + receiver.getAccountId() + ".Remaining funds of: " + getFunds() + ".");
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
