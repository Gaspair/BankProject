package bank;



import account.Account;
import client.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Bank implements IBank {

    UUID bankCode;
    String bankName;
    double funds;

    private final Account account;



    public Bank(String bankName, double funds) {
        this.bankCode = UUID.randomUUID();
        setBankName(bankName);
        this.account = new Account(funds,"Bank Account");
    }

    public UUID getBankCode() {
        return bankCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public double getFunds() {
        return funds;
    }

    public void setFunds(double funds) {
        this.funds = funds;
    }
}
