package com.dragos.sevices.SignIn;

import com.dragos.businessLogic.Client;

import java.sql.SQLException;

import static com.dragos.database.SignInQuery.SignInClient;

public class SignInImpl implements SignInInterface{
    @Override
    public Client signIn(int bank_id, String email, String password) {

        try{
        Client client = SignInClient(bank_id,email, password);
        if (client != null) {
            return client;
        } else {
            System.out.println("Client not found.");
        }
    }catch(SQLException e){
        e.printStackTrace();
    }

        return null;
    }



}
