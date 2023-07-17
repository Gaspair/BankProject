package com.dragos.bank;

import com.dragos.account.Account;
import com.dragos.client.Client;

import java.util.HashMap;

public class Bank {
    private String name;
    private Account bankAccount;
    double funds;

    public Bank(String name) {
        setName(name);
        this.bankAccount = new Account(funds);
        HashMapOfBanks.addNewBank(this);
    }

    HashMap<String, Client> listOfClients = new HashMap<String, Client>();

    public void addNewClientToList(Client client) {
        listOfClients.put(client.getClientEmail(), client);
    }

    public HashMap<String, Client> getListOfClients() {
        return listOfClients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
