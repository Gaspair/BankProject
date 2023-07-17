package com.dragos.gui;

import com.dragos.bank.HashMapOfBanks;
import com.dragos.client.Client;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LandingPage extends JFrame implements ActionListener {

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
        if (e.getSource() == depositButton) {
            String amount = JOptionPane.showInputDialog(this, "How much do you want to deposit ?");

            if(amount == null){
                 amount =  "0";
            }else{
                client.getClientAccount().depositFunds(Double.parseDouble(amount));
                clientFunds.setText(String.valueOf(client.getClientAccount().getFunds()));
            }



        } else if (e.getSource() == withdrawButton) {

            String amount = JOptionPane.showInputDialog(this, "How much would you want to withdraw today ?");

            if(amount == null){
                amount =  "0";
            }else{
                client.getClientAccount().withdrawFunds(Double.parseDouble(amount));
                clientFunds.setText(String.valueOf(client.getClientAccount().getFunds()));
            }




        } else if (e.getSource() == transferButton) {
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
            if (result == JOptionPane.OK_OPTION) {
                String receiverEmail = receiverEmailField.getText();
                String receiverBank =bankNames[( comboBoxBank.getSelectedIndex())];
                double amountSent = Double.parseDouble(amountSentField.getText());


                client.getClientAccount().transferFunds(HashMapOfBanks.getBankHashMap().get(receiverBank).getListOfClients().get(receiverEmail).getClientAccount(), amountSent);
                clientFunds.setText(String.valueOf(client.getClientAccount().getFunds()));

                System.out.println(HashMapOfBanks.getBankHashMap().get(receiverBank).getListOfClients().get(receiverEmail).getClientAccount().getFunds());

            }
        }
    }
}
