package com.dragos.service;

import com.dragos.account.Account;
import com.dragos.client.Client;

import javax.swing.*;

public class OperationsInterfaceImpl implements OperationsInterface {
    @Override
    public void depositFunds(Client client, double amount) {
        Account account = client.getClientAccount();
        account.setFunds(account.getFunds() + amount);

    }

    @Override
    public void withdrawFunds(Client client, double amount) {
        Account account = client.getClientAccount();
        if(account.getFunds() < amount){
            JOptionPane.showMessageDialog(null, "Insufficient Funds!");
        }else{
            account.setFunds(account.getFunds() - amount );
        }
    }

    @Override
    public void transferFunds(Client clientSender, Client clientReceiver, double amount) {
        Account accountReceiver = clientReceiver.getClientAccount();
        Account accountSender = clientSender.getClientAccount();


        if(accountSender.getFunds() < amount){
            JOptionPane.showMessageDialog(null, "Insufficient Funds!");
        }else if(accountSender.equals(accountReceiver)){
            JOptionPane.showMessageDialog(null, "You cannot send money to yourself...");
        }  else{
            accountSender.setFunds(accountSender.getFunds() - amount );
            accountReceiver.setFunds(accountReceiver.getFunds() + amount);
        }

    }


}
