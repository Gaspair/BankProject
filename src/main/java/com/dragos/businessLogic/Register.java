package com.dragos.businessLogic;


import com.dragos.bank.Bank;
import com.dragos.bank.HashMapOfBanks;
import com.dragos.client.Client;

import javax.swing.*;

public abstract class Register {



    public static void createNewClientAccount(String bankName, String firstName, String lastName, String clientEmail, String password, double funds) {

        Bank bank = HashMapOfBanks.getBankHashMap().get(bankName);
        if (bank != null) {
            bank.addNewClientToList(new Client(firstName, lastName, clientEmail, password, funds));
        } else {
            JOptionPane.showMessageDialog(null, "Bank not found"+ bankName);


        }
    }



}
