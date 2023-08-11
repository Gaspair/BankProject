package com.dragos;



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


        new MainFrame().MyFrame();
    }


}

