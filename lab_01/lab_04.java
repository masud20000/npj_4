import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lab_04 extends JFrame implements ActionListener {
    private JTextField inputField; // to show input
    private JTextField textField;
    private JButton[] numberButtons;
    private JButton[] functionButtons;
    private JButton addButton, subButton, mulButton, divButton, modButton, factButton;
    private JButton equalButton, clearButton, dotButton;
    private JPanel panel;

    private double num1, num2, result;
    private char operator;

    public lab_04() {
        setTitle("Calculator"); 
        setSize(350, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        panel = new JPanel();
        panel.setLayout(new GridLayout(6, 4));

        inputField = new JTextField();
        inputField.setHorizontalAlignment(SwingConstants.RIGHT);
        inputField.setEditable(false);

        textField = new JTextField();
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textField.setEditable(false);

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
        }

        functionButtons = new JButton[7];
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        modButton = new JButton("%");
        factButton = new JButton("!");
        equalButton = new JButton("=");
        clearButton = new JButton("C");
        dotButton = new JButton(".");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = modButton;
        functionButtons[5] = factButton;
        functionButtons[6] = equalButton;

        for (int i = 0; i < 7; i++) {
            functionButtons[i].addActionListener(this);
        }

        clearButton.addActionListener(this);
        dotButton.addActionListener(this);

        panel.add(inputField); // input field added
        panel.add(textField);
        panel.add(clearButton);
        panel.add(dotButton);

        for (int i = 1; i <= 9; i++) {
            panel.add(numberButtons[i]);
        }
        panel.add(functionButtons[0]);
        panel.add(numberButtons[0]);
        panel.add(functionButtons[1]);
        panel.add(functionButtons[2]);
        panel.add(functionButtons[3]);
        panel.add(functionButtons[4]);
        panel.add(functionButtons[5]);
        panel.add(functionButtons[6]);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new lab_04();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        for (int i = 0; i < 10; i++) {
            if (source == numberButtons[i]) {
                textField.setText(textField.getText() + i);
            }
        }

        if (source == dotButton) {
            if (!textField.getText().contains(".")) {
                textField.setText(textField.getText() + ".");
            }
        }

        if (source == clearButton) {
            inputField.setText("");
            textField.setText("");
        }

        if (source == addButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            inputField.setText(textField.getText() + "+");
            textField.setText("");
        }

        if (source == subButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            inputField.setText(textField.getText() + "-");
            textField.setText("");
        }

        if (source == mulButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            inputField.setText(textField.getText() + "*");
            textField.setText("");
        }

        if (source == divButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            inputField.setText(textField.getText() + "/");
            textField.setText("");
        }

        if (source == modButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '%';
            inputField.setText(textField.getText() + "%");
            textField.setText("");
        }

        if (source == factButton) {
            num1 = Double.parseDouble(textField.getText());
            inputField.setText(textField.getText() + "!");
            int factResult = factorial((int) num1);
            textField.setText(String.valueOf(factResult));
        }

        if (source == equalButton) {
            num2 = Double.parseDouble(textField.getText());

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0)
                        result = num1 / num2;
                    else
                        textField.setText("Infinity");
                    break;
                case '%':
                    result = num1 % num2;
                    break;
            }

            inputField.setText("");
            textField.setText(String.valueOf(result));
        }
    }

    private int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
