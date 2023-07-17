package com.dragos.account;

import javax.swing.*;
import java.util.UUID;

public class Account implements IAccount {

    private UUID accountId;
    private double funds;

    public Account(double funds){
        accountId = UUID.randomUUID();
        setFunds(funds);
    }
    private void setFunds(double funds) {
        this.funds = funds;
    }
    public double getFunds() {
        return funds;
    }
    public UUID getAccountId() {
        return accountId;
    }
    @Override
    public void depositFunds(double amount) {
        this.setFunds(this.getFunds() + amount );
    }
    @Override
    public void withdrawFunds(double amount) {
        if(this.getFunds() < amount){
            JOptionPane.showMessageDialog(null, "Insufficient Funds!");
        }else{
            this.setFunds(this.getFunds() - amount );
        }
    }

    public void transferFunds(Account receiver, double amount){
        if(this.getFunds() < amount){
            JOptionPane.showMessageDialog(null, "Insufficient Funds!");
        }else{
            this.setFunds(this.getFunds() - amount );
            receiver.setFunds(receiver.getFunds() + amount);
        }
    }


}
