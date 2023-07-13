package bank;

import account.Account;
import account.BankAccount;
import client.Client;


import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;

public class Bank {
    private UUID bankCode;
    private String bankName;
    double funds;
    private BankAccount account;


    private HashMap<String, Client> clientAccountList;


    public Bank(String bankName) {
        this.bankCode = UUID.randomUUID();
        setBankName(bankName + "Bank");
        this.account = new BankAccount(funds);
        clientAccountList = new HashMap<String, Client>();
        BankStorage.addNewBank(this);

    }


    public void addToClientList(Client clientAccount) {
        clientAccountList.put(clientAccount.getEmail(), clientAccount);
    }

    public UUID getBankCode() {
        return bankCode;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public String getBankName() {
        return bankName;
    }

}
