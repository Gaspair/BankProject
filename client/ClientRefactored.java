package client;


import account.ClientAccount;
import bank.BankRefactored;

import java.util.ArrayList;
import java.util.List;


public class ClientRefactored {
    private String firstName;
    private String lastName;
    private String email;

    private ArrayList<ClientAccount> clientAccountList;

    public ClientRefactored(String firstName, String lastName, double funds, String email, BankRefactored bankRefactored) {
        setClientName(firstName, lastName);
       createNewAccount(funds,bankRefactored);
        this.email = email;

    }

    public void createNewAccount(double funds, BankRefactored bankRefactored){
        clientAccountList = new ArrayList<ClientAccount>();
        clientAccountList.add(new ClientAccount(funds,bankRefactored.getBankCode()));

    }

    public List<ClientAccount> getClientAccountList() {
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

//    public ClientAccount getAccount() {
//        return account;
//    }
}
