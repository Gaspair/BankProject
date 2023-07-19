package com.dragos.gui;

import com.dragos.bank.HashMapOfBanks;
import com.dragos.client.Client;
import com.dragos.service.OperationsInterfaceImpl;
import com.dragos.service.OperationsInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LandingPage extends JFrame implements ActionListener {
    OperationsInterface transactionInterface = new OperationsInterfaceImpl();
    private Client client;
    JComboBox comboBoxBank;
    String[] bankNames;
    JLabel welcome = new JLabel("Welcome");
    JLabel funds = new JLabel("Funds");
    JButton depositButton = new JButton("Deposit");
    JButton withdrawButton = new JButton("Withdraw");
    JButton transferButton = new JButton("Transfer");
    JButton accountSettingButton = new JButton("Account \n settings");
    JLabel clientFunds;

    public LandingPage(Client client) {
        bankNames = HashMapOfBanks.getBankHashMap().keySet().toArray(new String[0]);
        this.client = client;
        welcome.setBounds(50, 100, 150, 50);
        welcome.setFont(new Font(null, Font.PLAIN, 25));

        funds.setBounds(50, 200, 150, 50);
        funds.setFont(new Font(null, Font.PLAIN, 25));

        clientFunds = new JLabel(String.valueOf(client.getClientAccount().getFunds()));
        clientFunds.setBounds(50, 250, 150, 50);
        clientFunds.setFont(new Font(null, Font.PLAIN, 18));

        String clientFullName = client.getFirstName().concat(" ").concat(client.getLastName());
        JLabel clientName = new JLabel(clientFullName);
        clientName.setBounds(50, 150, 150, 50);
        clientName.setFont(new Font(null, Font.PLAIN, 18));

        depositButton.setBounds(500, 120, 250, 150);
        depositButton.addActionListener(this);
        withdrawButton.setBounds(800, 120, 250, 150);
        withdrawButton.addActionListener(this);
        transferButton.setBounds(500, 300, 250, 150);
        transferButton.addActionListener(this);
        accountSettingButton.setBounds(800, 300, 250, 150);

        depositButton.addActionListener(e -> handleDeposit());
        withdrawButton.addActionListener(e -> handleWithdraw());
        transferButton.addActionListener(e -> handleTransfer());


        this.add(clientFunds);
        this.add(funds);
        this.add(accountSettingButton);
        this.add(transferButton);
        this.add(withdrawButton);
        this.add(depositButton);
        this.add(clientName);
        this.add(welcome);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1250, 650);
        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    private void handleDeposit() {
        String amount = JOptionPane.showInputDialog(this, "How much do you want to deposit ?");
        if (amount != null) {
            double depositAmount = parseAmount(amount);
            if (depositAmount > 0) {
                transactionInterface.depositFunds(client, depositAmount);
                updateClientFunds();
            } else {
                // Display error message for invalid amount
                showErrorMessage("Invalid amount. Please enter a positive number.");
            }
        }
    }


    private void handleWithdraw() {
        String amount = JOptionPane.showInputDialog(this, "How much would you want to withdraw today ?");
        if (amount != null) {
            double withdrawAmount = parseAmount(amount);
            if (withdrawAmount > 0) {
                transactionInterface.withdrawFunds(client, withdrawAmount);
                updateClientFunds();
            } else {
                // Display error message for invalid amount
                showErrorMessage("Invalid amount. Please enter a positive number.");
            }
        }
    }


    private void handleTransfer() {

        JPanel transferPanel = new JPanel(new GridLayout(3, 2));
        JTextField receiverEmailField = new JTextField(20);
        comboBoxBank = new JComboBox<String>((bankNames));
        JTextField amountSentField = new JTextField(10);

        transferPanel.add(new JLabel("Receiver's email:"));
        transferPanel.add(receiverEmailField);
        transferPanel.add(new JLabel("Receiver's bank:"));
        transferPanel.add(comboBoxBank);
        transferPanel.add(new JLabel("Amount to transfer:"));
        transferPanel.add(amountSentField);

        int result = JOptionPane.showConfirmDialog(this, transferPanel, "Transfer Funds", JOptionPane.OK_CANCEL_OPTION);
       if (!HashMapOfBanks.getBankHashMap().get(bankNames[(comboBoxBank.getSelectedIndex())]).getListOfClients().containsKey(receiverEmailField.getText())) {
            showErrorMessage(receiverEmailField.getText().substring(0,1).toUpperCase()+receiverEmailField.getText().substring(1) +" doesn't have an account open with "+(bankNames[(comboBoxBank.getSelectedIndex())]) +" !");
        } else if (result == JOptionPane.OK_OPTION) {
            transactionInterface.transferFunds(client, HashMapOfBanks.getBankHashMap().get(bankNames[(comboBoxBank.getSelectedIndex())]).getListOfClients().get(receiverEmailField.getText()), Double.parseDouble(amountSentField.getText()));
            updateClientFunds();
        }
    }
    private void updateClientFunds() {
        clientFunds.setText(String.valueOf(client.getClientAccount().getFunds()));
    }

    private double parseAmount(String input) {
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            return -1; // Return a negative value to indicate an error
        }
    }
    private void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
