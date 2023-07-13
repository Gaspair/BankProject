import account.ClientAccount;
import bank.Bank;
import client.Client;

import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.intellijthemes.FlatCobalt2IJTheme;
import com.formdev.flatlaf.intellijthemes.FlatDarkFlatIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatVuesionIJTheme;
import gui.MyFrame;

import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {
        Bank bank1 = new Bank("Lloyds");
        Bank bank2 = new Bank("Raifaissen");
        Bank bank3 = new Bank("Chase");
        Bank bank4 = new Bank("Monzo");
        Bank bank5 = new Bank("JPMorgan");
        Bank bank6 = new Bank("BRD");

        Client client1 = new Client("Dragos", "Baluta", 1000, "test@email.com", bank1);
        Client client2 = new Client("Andrei", "Panturu", 1500, "test@email.com", bank2);

        client1.createNewAccount(100, bank4);






                try {
            FlatDarkFlatIJTheme.setup();
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
       new MyFrame();


    }

}
