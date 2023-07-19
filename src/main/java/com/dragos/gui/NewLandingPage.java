//package com.dragos.gui;
//
//// Import statements here
//import com.dragos.bank.HashMapOfBanks;
//import com.dragos.client.Client;
//import com.dragos.service.OperationsInterfaceImpl;
//import com.dragos.service.OperationsInterface;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class NewLandingPage extends JFrame implements ActionListener {
//    // Class fields here
//
//    public NewLandingPage(Client client) {
//        // GUI initialization and layout setup here
//        // ...
//
//        depositButton.addActionListener(e -> handleDeposit());
//        withdrawButton.addActionListener(e -> handleWithdraw());
//        transferButton.addActionListener(e -> handleTransfer());
//        // ...
//    }
//

//

//
//    private void handleTransfer() {
//        // Transfer logic here
//        // ...
//    }
//
//    private double parseAmount(String input) {
//        try {
//            return Double.parseDouble(input);
//        } catch (NumberFormatException e) {
//            return -1; // Return a negative value to indicate an error
//        }
//    }
//
//    private void updateClientFunds() {
//        clientFunds.setText(String.valueOf(client.getClientAccount().getFunds()));
//    }
//
//    private void showErrorMessage(String message) {
//        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
//    }
//
//    // Other utility methods here
//    // ...
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        // Handle common actions, if any
//        // ...
//    }
//}
