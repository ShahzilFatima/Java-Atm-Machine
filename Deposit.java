package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    String cardno;
    TextField textField;

    JButton b1, b2;

    Deposit(String cardno) {
        this.cardno = cardno;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(850, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 850, 800);
        add(l3);

        JLabel label1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setBounds(250, 180, 400, 35);
        l3.add(label1);

        textField = new TextField();
        textField.setBackground(new Color(65, 125, 128));
        // textField.setForeground(Color.WHITE);
        textField.setBounds(250, 230, 320, 25);
        textField.setFont(new Font("Raleway", Font.BOLD, 22));
        l3.add(textField);

        b1 = new JButton("DEPOSIT");
        b1.setBounds(300, 362, 150, 35);
        // b1.setBackground(new Color(65, 125, 128));
        // b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(300, 406, 150, 35);
        // b2.setBackground(new Color(65, 125, 128));
        // b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);

        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {

            Date date = new Date();
            if (e.getSource() == b1) {
                long amount = 0;
                if (textField.getText() != "") {
                    amount = Long.parseLong(textField.getText());
                }
                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the amount you want to deposit.");
                } else if (!textField.getText().matches("[0-9]+")) {
                    JOptionPane.showMessageDialog(null, "Invalid Deposite Amount");
                } else {
                    FileHandlerAlpha.saveAccount(cardno, amount);
                    JOptionPane.showMessageDialog(null, "Cash deposited successfully.");
                    setVisible(false);
                    new main_Class(cardno);
                }
            } else if (e.getSource() == b2) {
                setVisible(false);
                new main_Class(cardno);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Deposit("");
    }
}
