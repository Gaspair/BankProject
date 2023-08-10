package com.dragos.sevices;

import businessLogic.Client;
import com.dragos.businessLogic.Account;

import com.dragos.database.DatabaseConnection;
import com.dragos.database.SignUpQuery;

import javax.swing.*;
import java.sql.*;


public class AuthServicesImpl implements com.dragos.sevices.AuthServicesInterface {
    @Override
    public Client signIn(int bank_id, String email, String password) throws SQLException {

            Client client =null;
            Connection myConn = DatabaseConnection.getInstance().getConnection();

        try{


            // 2. Create a statement
            PreparedStatement myStmt = myConn.prepareStatement("SELECT c.client_id, c.first_name, c.last_name, c.email, a.account_id, a.funds " +
                    "FROM client c " +
                    "JOIN account a ON c.account_id = a.account_id " +
                    "WHERE c.bank_id=? AND c.email=? AND c.password=?");

            myStmt.setInt(1, bank_id);
            myStmt.setString(2, email);
            myStmt.setString(3, password);

            // 3. Execute SQL query
           ResultSet myRs = myStmt.executeQuery();

            // 4. Process the result set
            if (myRs.next()) {
                int client_Id = myRs.getInt("client_id");
                String first_name = myRs.getString("first_name");
                String last_name = myRs.getString("last_name");
                int accountId = myRs.getInt("account_id");
                double funds = myRs.getDouble("funds");


                client = new Client(client_Id, first_name,last_name, email,new Account(accountId,funds));
            }else{
                JOptionPane.showMessageDialog(null, "Wrong credentials!");
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
            return client;

    }

    @Override
    public  boolean signUp(int bankId, String customerEmail, String password, String first_name, String last_name) throws SQLException {
        if( SignUpQuery.signUp(bankId, customerEmail, password, first_name, last_name)){
            return true;
        }
        return false;

    }
}
