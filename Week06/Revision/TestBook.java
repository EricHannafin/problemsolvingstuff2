package Week06.Revision;

import javax.swing.*;
import java.awt.*;

public class TestBook {

    public static void main(String[] args) {
        String title, ISBM, output = "";
        int pages;
        double price;

        JTextArea textArea = new JTextArea();
        Font font = new Font("Monospaced", Font.PLAIN, 12);
        textArea.setFont(font);

        textArea.setText(String.format("%-25s%-9s%-25s%s","Title","Price","ISBM","Pages" ));

        title = JOptionPane.showInputDialog("Please enter the name of your favourite title ");
        price = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of the book "));
        ISBM  = JOptionPane.showInputDialog("Please enter the ISBM ");
        pages = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of pages "));

        Book favBook = new Book(title,price,ISBM,pages);
        output += String.format("\n\n%-25s%-9s%-25s%s",favBook.getTitle(),favBook.getPrice(),favBook.getISBN(),favBook.getPages());

        textArea.append(output);

        JOptionPane.showMessageDialog(null, textArea,"Favourite Book Details", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
