import java.awt.event.*;
import javax.swing.*;

public class lab_02 extends JFrame implements ActionListener {
    JLabel l;
    JCheckBox cb1, cb2, cb3;
    JButton b;
    
    lab_02() {
        l = new JLabel("Food Ordering system");
        l.setBounds(50, 50, 300, 20);
        cb1 = new JCheckBox("Pizza @ 0.75$");
        cb1.setBounds(100, 100, 150, 20);
        cb2 = new JCheckBox("Burger @ 1$");
        cb2.setBounds(100, 150, 150, 20);
        cb3 = new JCheckBox("Tea @ 0.1$");
        cb3.setBounds(100, 200, 150, 20);
        b = new JButton("Order");
        b.setBounds(100, 250, 80, 30);
        b.addActionListener(this);
        add(l);
        add(cb1);
        add(cb2);
        add(cb3);
        add(b);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        float amount = 0;
        float vat = 0.15f; // 15% VAT
        float tax = 0.02f; // 2% tax
        String msg = "";
        if (cb1.isSelected()) {
            amount += 0.75;
            msg += "Pizza 0.75$\n";
        }
        if (cb2.isSelected()) {
            amount += 1.00;
            msg += "Burger 1$\n";
        }
        if (cb3.isSelected()) {
            amount += 0.1;
            msg += "Tea 1$\n";
        }

        float total = amount + (amount * vat) + (amount * tax);
        msg += "................\n";
        msg += "Total: " + total;
        JOptionPane.showMessageDialog(this, msg);
    }

    public static void main(String[] args) {
        new lab_02();
    }
}
