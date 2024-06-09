package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;

public class Withdrawl extends JFrame implements ActionListener {

    String cardno;
    TextField textField;

    JButton b1, b2;

    Withdrawl(String cardno) {
        this.cardno = cardno;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(850, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 850, 800);
        add(l3);

        JLabel label1 = new JLabel("MAXIMUM WITHDRAWAL IS RS.10,000");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setBounds(250, 180, 700, 35);
        l3.add(label1);

        JLabel label2 = new JLabel("PLEASE ENTER YOUR AMOUNT");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System", Font.BOLD, 16));
        label2.setBounds(250, 220, 400, 35);
        l3.add(label2);

        textField = new TextField();
        textField.setBackground(new Color(65, 125, 128));
        // textField.setForeground(Color.WHITE);
        textField.setBounds(270, 260, 320, 25);
        textField.setFont(new Font("Raleway", Font.BOLD, 22));
        l3.add(textField);

        b1 = new JButton("WITHDRAW");
        b1.setBounds(400, 362, 150, 35);
        b1.setForeground(Color.darkGray);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(400, 406, 150, 35);

        b2.setForeground(Color.DARK_GRAY);
        b2.addActionListener(this);
        l3.add(b2);

        setSize(850, 800);
        setLayout(null);
        setLocation(360, 40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ArrayList<String> cardNumbers = FileHandlerAlpha.getCardNumbers();
        ArrayList<Long> amounts = FileHandlerAlpha.getAmounts();

        if (e.getSource() == b1) {
            try {
                Date date = new Date();
                long amount = 0;
                if (textField.getText() != "") {
                    amount = Long.parseLong(textField.getText());
                }
                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the Amount you want to withdraw");
                } else if (!textField.getText().matches("[0-9]+")) {
                    JOptionPane.showMessageDialog(null, "Invalid Withdrawal Amount");
                } else if (amount > 10000) { // Check if withdrawal amount exceeds maximum limit
                    JOptionPane.showMessageDialog(null, "Maximum withdrawal limit is Rs. 10,000");
                } else {
                    for (int i = 0; i < cardNumbers.size(); i++) {
                        if (cardno.equals(cardNumbers.get(i))) {
                            if (amount <= amounts.get(i)) {
                                // Update the balance here
                                amounts.set(i, amounts.get(i) - amount);
                                JOptionPane.showMessageDialog(null,
                                        "Rs. " + amount + " Debited Successfully" + " (" + amounts.get(i) + ")");
                                setVisible(false);
                                new main_Class(cardno);
                                return; // Exit the loop once the withdrawal is successful
                            } else {
                                JOptionPane.showMessageDialog(null, "Insufficient Balance");
                                return; // Exit the loop if there's insufficient balance
                            }
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Invalid Card Number");
                }
            } catch (Exception E) {
                E.printStackTrace();
            }
        }
        if (e.getSource() == b2) {
            setVisible(false);
            new main_Class(cardno);
        }
    }

    public static void main(String[] args) {
        new Withdrawl("");
    }
}