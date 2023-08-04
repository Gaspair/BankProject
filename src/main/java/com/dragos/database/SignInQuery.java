package com.dragos.database;

import com.dragos.businessLogic.Account;
import com.dragos.businessLogic.Client;

import java.sql.*;

public class SignInQuery {

    public static Client signInClient(int bankId, String customerEmail, String password) throws SQLException {

        Client client = null;
        Connection myConn = null;
        PreparedStatement myStmt = null;
        ResultSet myRs = null;

        String dbUrl = "jdbc:mysql://localhost:3306/bankapp";
        String user = "user";
        String pass = "user";

        try {
            // 1. Get a connection to the database
            myConn = DriverManager.getConnection(dbUrl, user, pass);

            // 2. Create a statement
            myStmt = myConn.prepareStatement("SELECT c.client_id, c.first_name, c.last_name, c.email, a.account_id, a.funds " +
                    "FROM client c " +
                    "JOIN account a ON c.account_id = a.account_id " +
                    "WHERE c.bank_id=? AND c.email=? AND c.password=?");

            myStmt.setInt(1, bankId);
            myStmt.setString(2, customerEmail);
            myStmt.setString(3, password);

            // 3. Execute SQL query
            myRs = myStmt.executeQuery();

            // 4. Process the result set
            if (myRs.next()) {
                int clientId = myRs.getInt("client_id");
                String first_name = myRs.getString("first_name");
                String last_name = myRs.getString("last_name");
                int accountId = myRs.getInt("account_id");
                double funds = myRs.getDouble("funds");


                client = new Client(clientId, first_name,last_name, customerEmail,new Account(accountId,funds));
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            // 5. Close the resources
            if (myRs != null) {
                myRs.close();
            }

            if (myStmt != null) {
                myStmt.close();
            }

            if (myConn != null) {
                myConn.close();
            }
        }

        return client;
    }


}







