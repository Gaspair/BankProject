package com.dragos.sevices;

import businessLogic.Client;


import java.sql.SQLException;
import java.util.HashMap;

public interface AuthServicesInterface {

    public boolean signUp(int bankId, String customerEmail, String password,String first_name, String last_name, double funds) throws SQLException;


    public Client signIn(int bankId, String email, String password) throws SQLException;
    public HashMap getBanks() throws SQLException;
}
