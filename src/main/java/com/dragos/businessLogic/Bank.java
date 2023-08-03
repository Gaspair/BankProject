package com.dragos.businessLogic;


import com.dragos.businessLogic.Account;

public class Bank {
    private String name;
    private Account bankAccount;
    double funds;

    public Bank(String name) {
        setName(name);
        this.bankAccount = new Account(funds);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
