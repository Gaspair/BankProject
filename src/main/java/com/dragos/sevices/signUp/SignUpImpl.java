package com.dragos.sevices.signUp;

import com.dragos.businessLogic.Client;
import com.dragos.database.SignUpQuery;
import com.dragos.sevices.SignIn.SignInInterface;

import java.sql.SQLException;

public class SignUpImpl implements SignUpInterface {
    @Override
    public  boolean signUp(int bankId, String customerEmail, String password, String first_name, String last_name) throws SQLException {
        if( SignUpQuery.signUp(bankId, customerEmail, password, first_name, last_name)){
            return true;
        }
        return false;

    }


}
