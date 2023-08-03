package com.dragos.database;



        import com.dragos.businessLogic.Account;
        import com.dragos.businessLogic.Client;

        import java.sql.*;
        import java.util.HashMap;

public class GetBanksQuery {


    public static void getBanks() throws SQLException {

        HashMap banksHashMap = new HashMap();
        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;

        String dbUrl = "jdbc:mysql://localhost:3306/bankapp";
        String user = "user";
        String pass = "user";

        try {
            // 1. Get a connection to the database
            myConn = DriverManager.getConnection(dbUrl, user, pass);

            // 2. Create a statement
            myStmt = myConn.createStatement();



            // 3. Execute SQL query
            myRs = myStmt.executeQuery("SELECT * from BANK;");

            // 4. Process the result set
            while (myRs.next()) {
                banksHashMap.put(  myRs.getInt("bank_id"),myRs.getString("bank_name"));
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
    }


}







