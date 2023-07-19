package com.dragos.service;

import com.dragos.client.Client;

public interface OperationsInterface {
    void depositFunds(Client client, double amount);

    void withdrawFunds(Client client, double amount);

    void transferFunds(Client clientSender,Client clientReceiver, double amount);

}
