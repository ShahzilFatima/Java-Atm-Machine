package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox comboBox, comboBox2, comboBox3, comboBox4, comboBox5;
    JTextField textPhone, textCnic;
    JRadioButton r1, r2, e1, e2;
    JButton next;

    Signup2() {
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);

        JLabel l2 = new JLabel("Additonal Details");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        l2.setForeground(Color.WHITE);
        l2.setBounds(300, 60, 600, 40);
        add(l2);

        JLabel l3 = new JLabel("Religion :");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        l3.setForeground(Color.WHITE);
        l3.setBounds(100, 120, 100, 30);
        add(l3);

        String religion[] = { "Muslim", " Hindu", "Sikh", "Christian", "Other" };
        comboBox = new JComboBox(religion);
        comboBox.setBackground(Color.LIGHT_GRAY);
        comboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox.setBounds(350, 120, 320, 30);
        add(comboBox);

        JLabel l4 = new JLabel("Category : ");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        l4.setForeground(Color.WHITE);
        l4.setBounds(100, 170, 100, 30);
        add(l4);

        String Category[] = { "General", "OBC", "SC", "ST", "Other" };
        comboBox2 = new JComboBox(Category);
        comboBox2.setBackground(Color.LIGHT_GRAY);
        comboBox2.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox2.setBounds(350, 170, 320, 30);
        add(comboBox2);

        JLabel l5 = new JLabel("Income : ");
        l5.setFont(new Font("Raleway", Font.BOLD, 18));
        l5.setForeground(Color.WHITE);
        l5.setBounds(100, 220, 100, 30);
        add(l5);

        String income[] = { "Null", "<1,50,000", "<2,50,000", "5,00,000", "Uptp 10,00,000", "Above 10,00,000" };
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(Color.LIGHT_GRAY);
        comboBox3.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox3.setBounds(350, 220, 320, 30);
        add(comboBox3);

        JLabel l6 = new JLabel("Educational : ");
        l6.setFont(new Font("Raleway", Font.BOLD, 18));
        l6.setForeground(Color.WHITE);
        l6.setBounds(100, 270, 150, 30);
        add(l6);

        String educational[] = { "Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Others" };
        comboBox4 = new JComboBox(educational);
        comboBox4.setBackground(Color.LIGHT_GRAY);
        comboBox4.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox4.setBounds(350, 270, 320, 30);
        add(comboBox4);

        JLabel l7 = new JLabel("Occupation : ");
        l7.setFont(new Font("Raleway", Font.BOLD, 18));
        l7.setForeground(Color.WHITE);
        l7.setBounds(100, 340, 150, 30);
        add(l7);

        String Occupation[] = { "Salaried", "Self-Employed", "Business", "Student", "Retired", "Other" };
        comboBox5 = new JComboBox(Occupation);
        comboBox5.setBackground(Color.LIGHT_GRAY);
        comboBox5.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox5.setBounds(350, 340, 320, 30);
        add(comboBox5);

        JLabel l8 = new JLabel("Phone Number : ");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        l8.setForeground(Color.WHITE);
        l8.setBounds(100, 390, 150, 30);
        add(l8);

        textPhone = new JTextField();
        textPhone.setFont(new Font("Raleway", Font.BOLD, 18));
        textPhone.setBounds(350, 390, 320, 30);
        add(textPhone);

        JLabel l9 = new JLabel("CNIC Number : ");
        l9.setFont(new Font("Raleway", Font.BOLD, 18));
        l9.setForeground(Color.WHITE);
        l9.setBounds(100, 440, 180, 30);
        add(l9);

        textCnic = new JTextField();
        textCnic.setFont(new Font("Raleway", Font.BOLD, 18));
        textCnic.setBounds(350, 440, 320, 30);
        add(textCnic);

        JLabel l10 = new JLabel("Senior Citizen : ");
        l10.setFont(new Font("Raleway", Font.BOLD, 18));
        l10.setForeground(Color.WHITE);
        l10.setBounds(100, 490, 180, 30);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(Color.LIGHT_GRAY);
        r1.setBounds(350, 490, 100, 30);
        add(r1);
        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(Color.LIGHT_GRAY);
        r2.setBounds(460, 490, 100, 30);
        add(r2);

        JLabel l11 = new JLabel("Existing Account : ");
        l11.setFont(new Font("Raleway", Font.BOLD, 18));
        l11.setForeground(Color.WHITE);
        l11.setBounds(100, 540, 180, 30);
        add(l11);

        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("Raleway", Font.BOLD, 14));
        e1.setBackground(Color.LIGHT_GRAY);
        e1.setBounds(350, 540, 100, 30);
        add(e1);
        e2 = new JRadioButton("No");
        e2.setFont(new Font("Raleway", Font.BOLD, 14));
        e2.setBackground(Color.LIGHT_GRAY);
        e2.setBounds(460, 540, 100, 30);
        add(e2);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570, 640, 100, 30);
        next.addActionListener(this);
        add(next);

        ImageIcon sign1 = new ImageIcon(ClassLoader.getSystemResource("icon/signup2_back.png"));
        Image sign2 = sign1.getImage().getScaledInstance(850, 800, Image.SCALE_DEFAULT);
        ImageIcon sign3 = new ImageIcon(sign2);
        JLabel image1 = new JLabel(sign3);
        image1.setBounds(0, 0, 850, 800);
        add(image1);

        setLayout(null);
        setSize(850, 800);
        setLocation(450, 80);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String reli = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();

        String phone = textPhone.getText();
        String Cnic = textCnic.getText();

        String scitizen = "";
        if (r1.isSelected()) {
            scitizen = "Yes";
        } else if (r2.isSelected()) {
            scitizen = "No";
        }

        String eAccount = "";
        if (e1.isSelected()) {
            eAccount = "Yes";
        } else if (e2.isSelected()) {
            eAccount = "No";
        }

        try {
            if (textPhone.getText().equals("") || textCnic.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            } else if (!textPhone.getText().matches("[0-9]+") || !textCnic.getText().matches("[0-9]+")) {
                JOptionPane.showMessageDialog(null, "Invalid phone number or CNIC");
            } else {
                Filehandler2.saveData2(reli, cate, inc, edu, occ, phone, Cnic, scitizen, eAccount);
                new Signup3();
                setVisible(false);
            }
        } catch (Exception j) {
            j.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup2();
    }
}
