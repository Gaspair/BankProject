package com.dragos;



import com.dragos.database.GetBanksQuery;
import com.dragos.gui.MainFrame;
import com.formdev.flatlaf.FlatLightLaf;


import javax.swing.*;
import java.sql.SQLException;

import static com.dragos.database.SignInQuery.SignInClient;


public class Main {
    public static void main(String[] args) throws SQLException {



        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        GetBanksQuery.getBanks();
        new MainFrame().MyFrame();
    }


}
