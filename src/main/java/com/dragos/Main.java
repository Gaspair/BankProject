package com.dragos;


import com.dragos.bank.HashMapOfBanks;
import com.dragos.client.Client;
import com.dragos.gui.LandingPage;
import com.dragos.gui.MainFrame;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatDarkFlatIJTheme;

import javax.swing.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {



        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }


        new MainFrame().MyFrame();

//        new LandingPage(HashMapOfBanks.getBankHashMap().get("Monzo").getListOfClients().get("test1@gmail.com"));



    }


}
