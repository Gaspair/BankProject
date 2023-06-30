import account.Account;
import bank.Bank;
import client.Client;
import controller.Controller;
import gui.MyFrame;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.initBanks();
        controller.newCustomer("Andrew", 100,1);


        new MyFrame();














    }
}
