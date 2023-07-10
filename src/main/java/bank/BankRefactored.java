package bank;

import account.BankAccount;
import client.ClientRefactored;


import java.util.HashMap;
import java.util.UUID;

public class BankRefactored {
    private UUID bankCode;
    private String bankName;
    double funds;
    private BankAccount account;


    private HashMap<String, ClientRefactored> clientAccountList;


    public BankRefactored(String bankName) {
        this.bankCode = UUID.randomUUID();
        setBankName(bankName + "Bank");
        this.account = new BankAccount(funds);
        clientAccountList = new HashMap<String, ClientRefactored>();
        BankStorage.addNewBank(this);

    }


    public void addToClientList(ClientRefactored clientAccount) {
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

    public double checkFunds() {
        return account.getFunds();
    }


}
