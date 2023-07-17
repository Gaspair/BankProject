package com.dragos.businessLogic;

import com.dragos.bank.HashMapOfBanks;
import com.dragos.client.Client;

import javax.swing.*;
import java.util.Objects;

public class Login {





    public boolean loginClient(String bankName, String email, String password) {
        Client client = HashMapOfBanks.getBankHashMap().get(bankName).getListOfClients().get(email);
        if (client != null) {
            String clientPassword = client.getClientPassword();
            if (Objects.equals(clientPassword, password)) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect password!");

                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Client not found!");

            return false;
        }
    }
}
