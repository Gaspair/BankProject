package com.dragos.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener {
    JButton newCustomer;
    JButton loginPage;



    public void MyFrame(){



        int frameWidth = 750;
        int frameHeight = 750;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        JLabel label = new JLabel("First things first!");
        label.setBounds(frameWidth/3-30 , 0, 500, 250); // Set the position and size of the label

        Font labelFont = new Font(label.getFont().getName(), Font.PLAIN, 50);
        label.setFont(labelFont);

        newCustomer = new JButton("New Customer");
        loginPage = new JButton("Existing Customer");

        newCustomer.addActionListener(this);
        loginPage.addActionListener(this);

        // Set the button positions and sizes
        newCustomer.setBounds(frameWidth/3, frameHeight/4+25, 250, 150);
        loginPage.setBounds(frameWidth/3, frameHeight/4 +175 , 250, 150);

        // Add the buttons to the frame
        this.add(newCustomer);
        this.add(loginPage);
        this.add(label);

        this.pack();
        this.setSize(frameWidth, frameHeight);
        this.setResizable(false);
        this.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == newCustomer){
            this.dispose();
            new RegisterPage();

        } else if (e.getSource() == loginPage) {
            this.dispose();
            LoginPage loginPageWindow =  new LoginPage();

        }

    }


}
