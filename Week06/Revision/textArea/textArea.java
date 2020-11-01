package Week06.Revision.textArea;

import javax.swing.*;
import java.awt.*;

public class textArea {
    public static void main(String[] args) {

        String name, number, town, output = "", age;


        JTextArea textArea = new JTextArea();
        Font font = new Font("Monospaced", Font.PLAIN, 12);
        textArea.setFont(font);

        textArea.setText(String.format("%-25s%-9s%-25s%-9s", "Name", "Number", "Town", "Age"));

        name = JOptionPane.showInputDialog("What is your name ");
        number = JOptionPane.showInputDialog("What is your telephone number");
        town = JOptionPane.showInputDialog("What town are you from ");
        age = JOptionPane.showInputDialog("What is your age in years ");

        output += String.format("\n\n%-25s%-9s%-25s%-9s",name,number,town,age);

        String[] people = new String[3];
        people[0] = "Mike Smith, 0234234, 22, Tralee";
        people[1] = "Shane Bradley, 234234243, 23, Tralee";
        people[2] = "John Smith, 234244, 24, Tralee";

        for (int i = 0; i < people.length; i++){
            output += String.format("\n\n%-25s",people[i]);
        }

        textArea.append(output);

        JOptionPane.showMessageDialog(null,textArea,"Persons Info", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);


    }
}
