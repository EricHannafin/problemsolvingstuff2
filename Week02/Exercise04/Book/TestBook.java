package Week02.Exercise04.Book;

import javax.swing.*;
import java.awt.*;


public class TestBook {
    public static void main(String[] args) {

        String titleFavourite = JOptionPane.showInputDialog("Please enter the title of your favourite book ");

        double pricefavourite = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of " +
                                                                                     "your favourite book "));

        String isbnFavourite = JOptionPane.showInputDialog("Please enter the isbn of your favourite book ");

        int pagesFavourite = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of pages in your " +
                                                                                    "favourite book "));


        //do similar for the other attributes

        Book favouriteBook = new Book(titleFavourite, pricefavourite, isbnFavourite, pagesFavourite);

        //String output = "The details of you favourite book are " +favouriteBook.toString();

        JTextArea textArea = new JTextArea();
        Font font = new Font("monospaced",Font.PLAIN,12);
        textArea.setFont(font);


        JOptionPane.showMessageDialog(null,textArea,"Favourite Book",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }

}