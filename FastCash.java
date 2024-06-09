package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {

    JButton b1, b2, b3, b4, b5, b6, b7;
    String cardno;

    FastCash(String cardno) {
        this.cardno = cardno;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(850, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 850, 800);
        add(l3);

        JLabel label = new JLabel("SELECT WITHDRAWL AMOUNT");
        label.setBounds(250, 180, 700, 35);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("System", Font.BOLD, 23));
        l3.add(label);

        b1 = new JButton("Rs. 100");
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(65, 125, 128));
        b1.setBounds(250, 274, 150, 35);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("Rs. 500");
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(65, 125, 128));
        b2.setBounds(500, 274, 150, 35);
        b2.addActionListener(this);
        l3.add(b2);

        b3 = new JButton("Rs. 1000");
        b3.setForeground(Color.WHITE);
        b3.setBackground(new Color(65, 125, 128));
        b3.setBounds(250, 318, 150, 35);
        b3.addActionListener(this);
        l3.add(b3);

        b4 = new JButton("Rs. 2000");
        b4.setForeground(Color.WHITE);
        b4.setBackground(new Color(65, 125, 128));
        b4.setBounds(500, 318, 150, 35);
        b4.addActionListener(this);
        l3.add(b4);

        b5 = new JButton("Rs. 5000");
        b5.setForeground(Color.WHITE);
        b5.setBackground(new Color(65, 125, 128));
        b5.setBounds(250, 362, 150, 35);
        b5.addActionListener(this);
        l3.add(b5);

        b6 = new JButton("Rs. 10000");
        b6.setForeground(Color.WHITE);
        b6.setBackground(new Color(65, 125, 128));
        b6.setBounds(500, 362, 150, 35);
        b6.addActionListener(this);
        l3.add(b6);

        b7 = new JButton("BACK");
        b7.setForeground(Color.WHITE);
        b7.setBackground(new Color(65, 125, 128));
        b7.setBounds(250, 406, 150, 35);
        b7.addActionListener(this);
        l3.add(b7);

        setSize(850, 800);
        setLayout(null);
        setLocation(360, 40);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int amount = 0; // Initialize amount to avoid compilation error

        ArrayList<String> cardNumbers = FileHandlerAlpha.getCardNumbers();
        ArrayList<Long> amounts = FileHandlerAlpha.getAmounts();

        if (e.getSource() == b1) {
            amount = 100;
        } else if (e.getSource() == b2) {
            amount = 500;
        } else if (e.getSource() == b3) {
            amount = 1000;
        } else if (e.getSource() == b4) {
            amount = 2000;
        } else if (e.getSource() == b5) {
            amount = 5000;
        } else if (e.getSource() == b6) {
            amount = 10000;
        } else if (e.getSource() == b7) {
            setVisible(false);
            new main_Class(cardno);
            return; // Exit the method after handling b7
        }

        try {
            // Check if card exists and balance is sufficient
            for (int i = 0; i < cardNumbers.size(); i++) {
                if (cardno.equals(cardNumbers.get(i))) {
                    if (amount <= amounts.get(i)) {
                        // Update balance
                        amounts.set(i, amounts.get(i) - amount);
                        JOptionPane.showMessageDialog(null,
                                "Rs. " + amount + " Debited Successfully" + " (" + amounts.get(i) + ")");
                        setVisible(false);
                        new main_Class(cardno);
                        return; // Exit the method after successful withdrawal
                    } else {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        return; // Exit the method if balance is insufficient
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Card not found."); // Notify if card not found
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new FastCash("");
    }
}
