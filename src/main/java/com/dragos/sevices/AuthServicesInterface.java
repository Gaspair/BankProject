package com.dragos.sevices;

import businessLogic.Client;


import java.sql.SQLException;

public interface AuthServicesInterface {

    public boolean signUp(int bankId, String customerEmail, String password,String first_name, String last_name) throws SQLException;


    public Client signIn(int bankId, String email, String password) throws SQLException;
}
