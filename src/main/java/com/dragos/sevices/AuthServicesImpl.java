package com.dragos.sevices;

import businessLogic.Client;
import com.dragos.businessLogic.Account;

import com.dragos.database.DatabaseConnection;
import com.dragos.database.SignUpQuery;

import javax.swing.*;
import java.sql.*;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class AuthServicesImpl implements com.dragos.sevices.AuthServicesInterface {

    @Override
    public Client signIn(int bank_id, String email, String password) throws SQLException {

        Client client = null;
        Connection myConn = DatabaseConnection.getInstance().getConnection();

        try {
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


                client = new Client(client_Id, first_name, last_name, email, new Account(accountId, funds));
            } else {
                JOptionPane.showMessageDialog(null, "Wrong credentials!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return client;

    }

    @Override
    public boolean signUp(int bankId, String customerEmail, String password, String first_name, String last_name) throws SQLException {
        Connection myConn = DatabaseConnection.getInstance().getConnection();

        PreparedStatement insertAccountStmt = null;
        PreparedStatement insertClientStmt = null;
        ResultSet generatedKeys = null;

        if (!formValidator(customerEmail)) {
            return false;
        }

        try {


            // 2. Create a statement to insert a new account
            insertAccountStmt = myConn.prepareStatement("INSERT INTO account (funds) VALUES (?)", Statement.RETURN_GENERATED_KEYS);
            insertAccountStmt.setDouble(1, 0); // Assuming you want to start with 0 funds
            insertAccountStmt.executeUpdate();

            // 3. Retrieve the generated account_id
            generatedKeys = insertAccountStmt.getGeneratedKeys();
            int accountId = -1;
            if (generatedKeys.next()) {
                accountId = generatedKeys.getInt(1);
            }

            // 4. Create a statement to insert a new client
            insertClientStmt = myConn.prepareStatement("INSERT INTO client (account_id, bank_id, email, password, first_name, last_name) VALUES (?, ?, ?, ?, ?, ?)");
            insertClientStmt.setInt(1, accountId);
            insertClientStmt.setInt(2, bankId);
            insertClientStmt.setString(3, customerEmail);
            insertClientStmt.setString(4, password);
            insertClientStmt.setString(5, first_name);
            insertClientStmt.setString(6, last_name);
            insertClientStmt.executeUpdate();


        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return true;
    }

    @Override
    public HashMap getBanks() throws SQLException {
        Connection myConn = DatabaseConnection.getInstance().getConnection();
        HashMap banksHashMap = new HashMap();

        try {


            // 2. Create a statement
            Statement myStmt = myConn.createStatement();


            // 3. Execute SQL query
            ResultSet myRs = myStmt.executeQuery("SELECT * from BANK;");

            // 4. Process the result set
            while (myRs.next()) {
                banksHashMap.put(myRs.getString("bank_name"), myRs.getInt("bank_id"));
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
        return banksHashMap;
    }


    private boolean formValidator(String email) {
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);


        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(null, "Please enter a valid email address!");
            return false;
        }
        return true;
    }
}
