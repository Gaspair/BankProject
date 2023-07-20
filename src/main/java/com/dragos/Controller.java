//package com.dragos;
//import com.dragos.client.Client;
//
//import java.sql.*;
//
//public class Controller {
//
//
//    private DatabaseConnection databaseConnection;
//
//    public Controller(DatabaseConnection databaseConnection) {
//        this.databaseConnection = databaseConnection;
//    }
//
//
//    public Controller(Client client) throws SQLException {
//        this.client = client;
//    }
//
//    // Rest of the main method and other code remains unchanged
//
//    private PreparedStatement myStmt;
//    // Within the try block:
//    int rowsAffected = myStmt.executeUpdate(
//            "insert into employees " +
//                    "(last_name, first_name, password, email, account_id) " +
//                    "values " +
//                    "('" + client.getLastName() + "', '" + client.getFirstName() + "', '" +
//                    client.getClientPassword() + "', '" + client.getClientEmail() + "', " + client.getClientAccount().getAccountId() + ")");
//}
package com.dragos;
import com.dragos.client.Client;

import java.sql.*;

public class Controller {
    private DatabaseConnection databaseConnection;

    public Controller(DatabaseConnection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    public void insertClient(Client client) {
        Connection myConn = null;
        PreparedStatement myStmt = null;

        try {
            // Get a connection to the database
            myConn = databaseConnection.getConnection();

            // Create a prepared statement
            String sql = "INSERT INTO clients (last_name, first_name, password, email, account_id) " +
                    "VALUES (?, ?, ?, ?, ?)";
            myStmt = myConn.prepareStatement(sql);

            // Set the parameters for the prepared statement
            myStmt.setString(1, client.getLastName());
            myStmt.setString(2, client.getFirstName());
            myStmt.setString(3, client.getClientPassword());
            myStmt.setString(4, client.getClientEmail());
            myStmt.setString(5, client.getClientAccount().getAccountId().toString());

            // Execute the query
            int rowsAffected = myStmt.executeUpdate();
            System.out.println(rowsAffected + " client(s) inserted.");

        } catch (SQLException exc) {
            exc.printStackTrace();
        } finally {
            // Close resources
            try {
                if (myStmt != null) {
                    myStmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
