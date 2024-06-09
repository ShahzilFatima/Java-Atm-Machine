package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_Class extends JFrame implements ActionListener {
    JButton b1, b2, b3, b4, b5, b6, b7;
    String cardno;

    main_Class(String cardno) {
        this.cardno = cardno;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(850, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 850, 800);
        add(l3);

        JLabel label = new JLabel("Please Select Your Transaction");
        label.setBounds(230, 180, 700, 35);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("System", Font.BOLD, 28));
        l3.add(label);

        b1 = new JButton("DEPOSIT");
        b1.setForeground(Color.DARK_GRAY);

        b1.setBounds(230, 274, 150, 35);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("CASH WITHDRAWL");
        b2.setForeground(Color.DARK_GRAY);

        b2.setBounds(450, 274, 150, 35);
        b2.addActionListener(this);
        l3.add(b2);

        b3 = new JButton("FAST CASH");
        b3.setForeground(Color.DARK_GRAY);

        b3.setBounds(230, 318, 150, 35);
        b3.addActionListener(this);
        l3.add(b3);

        b4 = new JButton("MINI STATEMENT");
        b4.setForeground(Color.DARK_GRAY);

        b4.setBounds(450, 318, 150, 35);
        b4.addActionListener(this);
        l3.add(b4);

        b5 = new JButton("PIN CHANGE");
        b5.setForeground(Color.DARK_GRAY);

        b5.setBounds(230, 362, 150, 35);
        b5.addActionListener(this);
        l3.add(b5);

        b6 = new JButton("BALANCE ENQUIRY");
        b6.setForeground(Color.DARK_GRAY);

        b6.setBounds(450, 362, 150, 35);
        b6.addActionListener(this);
        l3.add(b6);

        b7 = new JButton("EXIT");

        b7.setForeground(Color.DARK_GRAY);

        b7.setBounds(450, 406, 150, 35);
        b7.addActionListener(this);
        l3.add(b7);

        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            new Deposit(cardno);
            setVisible(false);
        } else if (e.getSource() == b7) {
            System.exit(0);
        } else if (e.getSource() == b2) {
            new Withdrawl(cardno);
            setVisible(false);
        } else if (e.getSource() == b6) {
            new BalanceEnquiry(cardno);
            setVisible(false);
        } else if (e.getSource() == b3) {
            new FastCash(cardno);
            setVisible(false);
        } else if (e.getSource() == b5) {
            new Pin(cardno);
            setVisible(false);
        } else if (e.getSource() == b4) {
            new mini(cardno);
        }
    }

    public static void main(String[] args) {
        new main_Class("");
    }
}
