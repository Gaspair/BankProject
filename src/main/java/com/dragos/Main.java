package com.dragos;



import com.dragos.database.GetBanksQuery;
import com.dragos.database.SignInQuery;
import com.dragos.database.SignUpQuery;
import com.dragos.gui.MainFrame;
import com.formdev.flatlaf.FlatLightLaf;


import javax.swing.*;
import java.sql.SQLException;




public class Main {
    public static void main(String[] args) throws SQLException {



        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }


        GetBanksQuery.getBanks();
        new MainFrame().MyFrame();
//        SignUpQuery.SignUp(1,"test2@gmail.com","test123","Ana","Eisgang");

//        System.out.println( SignInQuery.SignInClient(1,"test2@gmail.com","test123").getClientAccount().getFunds());
    }


}

