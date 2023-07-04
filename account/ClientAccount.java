package account;

import java.util.UUID;

public class ClientAccount extends Account {
    private UUID bankCode;
    public ClientAccount(double funds, UUID bankCode) {
        super(funds, "Client Account");
        this.bankCode = bankCode;
    }

    public UUID getBankCode() {
        return bankCode;
    }

    public void checkFunds(){
        System.out.println("You have " + getFunds() + " left in your bank account");
    }
    @Override
    public void depositFunds(double amount) {
        setFunds(amount + getFunds());

        System.out.println("The amount of " + amount + " was deposited to account:" + getAccountId() + ".New sold is: " + getFunds() + ".");
    }
    @Override
    public void withdrawFunds(double amount) {
        if (getFunds() < amount) {
            System.out.println("Insufficient funds!");
        } else {
            setFunds(getFunds() - amount);
            System.out.println("The amount of " + amount + " was deposited to account:" + getAccountId() + ".New sold is: " + getFunds() + ".");
        }
    }



    public void transferFunds(double amount, ClientAccount receiver) {
        if (getFunds() < amount) {
            System.out.println("Insufficient funds!");
        } else {
                this.setFunds(getFunds() - amount);
                receiver.setFunds(receiver.getFunds() + amount);
                System.out.println("The amount of " + amount + " was transferred from account:" + getAccountId() + ", to account:" + receiver.getAccountId() + ".Remaining funds of: " + getFunds() + ".");
            }
    }


}
