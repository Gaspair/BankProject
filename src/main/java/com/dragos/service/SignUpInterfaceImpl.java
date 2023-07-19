package com.dragos.service;

import com.dragos.bank.HashMapOfBanks;
import com.dragos.client.Client;

public class SignUpInterfaceImpl implements SignUpInterface {

    @Override
    public void singUpClient(String bankName, String firstName, String lastName, String clientEmail, String password, double funds) {
        HashMapOfBanks.getBankHashMap().get(bankName).addNewClientToList(new Client(firstName, lastName, clientEmail, password, funds));

    }
}
