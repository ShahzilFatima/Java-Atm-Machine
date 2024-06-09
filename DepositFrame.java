package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import java.sql.*;

public class DepositFrame extends JFrame implements ActionListener {
    private String pin;
    private JTextField textField;
    private JButton b1, b2;
    private Connection connection;
    private Statement statement;

    public DepositFrame(String pin) {
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel backgroundLabel = new JLabel(i3);
        backgroundLabel.setBounds(0, 0, 1550, 830);

        JLabel label1 = new JLabel("Enter amount you want to deposit");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setBounds(460, 180, 400, 35);
        backgroundLabel.add(label1);

        textField = new JTextField();
        textField.setBounds(460, 230, 320, 25);
        textField.setFont(new Font("Raleway", Font.BOLD, 22));
        textField.setBackground(new Color(65, 125, 128));
        textField.setForeground(Color.WHITE);
        backgroundLabel.add(textField);

        b1 = new JButton("DEPOSIT");
        b1.setBounds(700, 362, 150, 35);
        b1.setBackground(new Color(65, 125, 128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        backgroundLabel.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(700, 406, 150, 35);
        b2.setBackground(new Color(65, 125, 128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        backgroundLabel.add(b2);

        backgroundLabel.setLayout(null);

        add(backgroundLabel);

        setSize(1550, 1000);
        setLocation(8, 8);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        try {
            String amount = textField.getText();
            Date date = new Date();
            if (e.getSource() == b1) {
                if (amount.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter the amount you want to deposit");
                } else {
                    String query = "INSERT INTO bank (pin, transaction_date, transaction_type, amount) VALUES ('" + pin
                            + "', '" + date + "', 'Deposit', '" + amount + "')";
                    statement.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Rs." + amount + " deposited successfully");
                    setVisible(false);
                }
            } else if (e.getSource() == b2) {
                setVisible(false);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error occurred while depositing amount: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new DepositFrame("");
    }
}
