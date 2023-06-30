package client;


import account.Account;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public class Client implements IClient {

    private final Account account;

    private UUID clientId;
    private String firstName;
    private UUID bankCode;


    public Client(String firstName,double funds) {
        this.clientId = UUID.randomUUID();
        setClientName(firstName);
        this.account = new Account(funds,"Client Account");
    }

    public Account getClientAccount() {
        return account;
    }
    public UUID  getClientId() {
        return clientId;
    }

    public void checkFunds(){

        System.out.println("You have " + getClientAccount().getFunds() + " left in your bank account");
    }

    public void setBankCode(UUID bankCode){
        this.bankCode = bankCode;
    }

    public UUID getBankCode(){
        return bankCode;
    }

    public String getClientName() {
        return firstName;
    }

    public void setClientName(String firstName) {
        this.firstName = firstName;
    }

    public void transferFunds(double amount,@NotNull Client receiverClient) {
        if(getBankCode() == receiverClient.getBankCode() && this.getClientAccount().getAccountId() != receiverClient.getClientAccount().getAccountId() ){
            this.getClientAccount().transferFunds(amount,receiverClient.getClientAccount() );
        }
        System.out.println(account.getFunds() + " **********"+receiverClient.getClientAccount().getFunds());

    }


}
