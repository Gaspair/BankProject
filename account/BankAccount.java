package account;

public class BankAccount extends Account {
    public BankAccount(double funds) {
        super(funds, "Bank Account");
    }

    public void checkFunds(){
        System.out.println("You have " + getFunds() + " left in your bank account");
    }


    public void transferFunds(double amount,  Account receiver) {


    }
}
