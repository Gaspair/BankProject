package com.dragos.account;

import java.util.UUID;

public class Account {

    private UUID accountId;
    private double funds;

    public Account(double funds){
        accountId = UUID.randomUUID();
        setFunds(funds);
    }
    public void setFunds(double funds) {
        this.funds = funds;
    }
    public double getFunds() {
        return funds;
    }
    public UUID getAccountId() {
        return accountId;
    }





    public void transferFunds(Account receiver, double amount){
    }


}
