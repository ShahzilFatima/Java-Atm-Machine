package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class BalanceEnquiry extends JFrame implements ActionListener {

    String cardno;
    JLabel label1;
    JLabel label2;
    JButton b1;

    BalanceEnquiry(String cardno) {
        this.cardno = cardno;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(850, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 850, 800);
        add(l3);

        label1 = new JLabel("Card Number:");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setBounds(200, 180, 150, 35);
        l3.add(label1);

        JLabel label3 = new JLabel("Balance:");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("System", Font.BOLD, 16));
        label3.setBounds(200, 230, 150, 35);
        l3.add(label3);

        label2 = new JLabel();
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System", Font.BOLD, 16));
        label2.setBounds(350, 180, 400, 35);
        l3.add(label2);

        JLabel label4 = new JLabel();
        label4.setForeground(Color.WHITE);
        label4.setFont(new Font("System", Font.BOLD, 16));
        label4.setBounds(350, 230, 400, 35);
        l3.add(label4);

        b1 = new JButton("Back");
        b1.setBounds(500, 406, 150, 35);
        b1.setBackground(new Color(65, 125, 128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        int balance = 0;
        try {
            ArrayList<String> cardNumbers = FileHandlerAlpha.getCardNumbers();
            ArrayList<Long> amounts = FileHandlerAlpha.getAmounts();

            for (int i = 0; i < cardNumbers.size(); i++) {
                if (cardno.equals(cardNumbers.get(i))) {
                    balance = amounts.get(i).intValue(); // Get balance corresponding to the card number
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        label2.setText(cardno);
        label4.setText("Rs " + balance);

        setSize(850, 800);
        setLayout(null);
        setLocation(360, 40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            setVisible(false);
            new main_Class(cardno);
        }
    }

    public static void main(String[] args) {
        new BalanceEnquiry("");
    }
}
