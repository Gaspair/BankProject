package account;

public interface IAccount {

    void depositFunds(double amount);
    void withdrawFunds(double amount);

    void transferFunds(double amount, Account receiver);
}
