package ru.mirea.lab15.task3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;


    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String name) {
        model.setName(name);
    }

    public void setEmployeeSalary(int salary) {
        model.setSalary(salary);
    }

    public String getEmployeeName() {
        return model.getName();
    }

    public int getEmployeeSalary() {
        return model.getSalary();
    }

    public void updateView() {
        EmployeeView.admitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    model.setSalary(Integer.parseInt(EmployeeView.jTextField.getText()));
                    view.printEmployeeDetails(model);
                }
                catch (NumberFormatException e){
                    EmployeeView.jTextField.setText("Not a Number!");
                }
            }
        });

    }


}
