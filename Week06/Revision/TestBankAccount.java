package Week06.Revision;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class TestBankAccount {
    public static void main(String[] args) {

        String output = "";

        BankAccount BankAccount1 = new BankAccount("John Murphy", 3412, 1142);
        BankAccount BankAccount2 = new BankAccount("Paul Murphy", 3312, 1132);
        BankAccount BankAccount3 = new BankAccount("Mike Murphy", 3212, 1122);
        BankAccount BankAccount4 = new BankAccount("Paul Hannafin", 3112, 1112);
        BankAccount BankAccount5 = new BankAccount("Peter Murphy", 3012, 1102);


        BankAccount[] BankAccounts = new BankAccount[5];

        BankAccounts[0] = BankAccount1;
        BankAccounts[1] = BankAccount2;
        BankAccounts[2] = BankAccount3;
        BankAccounts[3] = BankAccount4;
        BankAccounts[4] = BankAccount5;

        Arrays.sort(BankAccounts);

        for (int i = 0; i < BankAccounts.length; i++) {
            output += "\n\nBank account " + (i + 1) + BankAccounts[i];
        }

        output += "\n\nHere are the members in the array with the name Paul";

        for (int i = 0; i < BankAccounts.length; i++) {
            String pauls = "";
            if(BankAccounts[i].getOwner().contains("Paul")){
                pauls += BankAccounts[i];
            }
            output += "\n"+pauls;
        }

        JOptionPane.showMessageDialog(null, output, "Bank Account Details", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
