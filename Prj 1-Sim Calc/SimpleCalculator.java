import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JTextField num1Field = new JTextField(10);
        JTextField num2Field = new JTextField(10);
        JButton addButton = new JButton("Add");
        JLabel resultLabel = new JLabel("Result: ");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());
                    int sum = num1 + num2;
                    resultLabel.setText("Result: " + sum);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter valid numbers");
                }
            }
        });

        frame.add(new JLabel("Number 1: "));
        frame.add(num1Field);
        frame.add(new JLabel("Number 2: "));
        frame.add(num2Field);
        frame.add(addButton);
        frame.add(resultLabel);

        frame.setVisible(true);
    }
}