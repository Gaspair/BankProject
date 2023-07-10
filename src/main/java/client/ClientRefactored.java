package client;


import account.ClientAccount;
import bank.BankRefactored;

import java.util.ArrayList;


public class ClientRefactored {
    private String firstName;
    private String lastName;
    private String email;

    private ArrayList<ClientAccount> clientAccountList = new ArrayList<ClientAccount>();

    public ClientRefactored(String firstName, String lastName, double funds, String email, BankRefactored bankRefactored) {
        setClientName(firstName, lastName);
        createNewAccount(funds, bankRefactored);
        this.email = email;

    }

    public void createNewAccount(double funds, BankRefactored bankRefactored) {
        clientAccountList.add(new ClientAccount(funds, bankRefactored.getBankCode()));
        bankRefactored.addToClientList(this);

    }

    public ArrayList<ClientAccount> getClientAccountList() {
        return clientAccountList;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setClientName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Client Accounts: " + clientAccountList.toString();
    }

//    public ClientAccount getAccount() {
//        return account;
//    }
}
