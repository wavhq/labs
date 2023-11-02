package ru.mirea.lab15.task3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeView extends JFrame {
    private JFrame frame;
    private JPanel infoPanel = new JPanel();
    private JPanel enterPanel = new JPanel();
    private JLabel labelName = new JLabel();
    private JLabel labelSalary = new JLabel();
    public static JTextField jTextField = new JTextField(10);

    public static JButton admitButton = new JButton("Set Salary");
    private Font font = new Font("Arial", 1, 60);

    public EmployeeView() {
        super("Employee Salary");
        frame = new JFrame();
        frame.setLayout(new GridLayout());
        frame.setVisible(true);
        frame.setSize(1200, 500);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        labelName.setHorizontalAlignment(SwingConstants.CENTER);
        labelSalary.setHorizontalAlignment(SwingConstants.CENTER);
        labelName.setFont(font);
        labelSalary.setFont(font);
        jTextField.setFont(font);
        admitButton.setFont(font);
        infoPanel.add(labelName);
        infoPanel.add(labelSalary);
        enterPanel.add(jTextField);
        enterPanel.add(admitButton);
        frame.add(infoPanel);
        frame.add(enterPanel);

    }

    public void printEmployeeDetails(Employee e) {
        //System.out.println("Employee:\nname: " + e.getName() + "\nsalary: " + e.getSalary());
        labelName.setText("Name: " + e.getName());
        labelSalary.setText("Salary: " + e.getSalary());
    }
}
