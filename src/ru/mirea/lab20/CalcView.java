package ru.mirea.lab20;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcView extends JFrame {
    public static void createGUI(CalcModel model) {
        JFrame jFrame = new JFrame("Polish Calculator");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        JLabel calcResult = new JLabel("",SwingConstants.RIGHT);
        calcResult.setBounds(0,0,480,60);
        calcResult.setFont(new Font("Times",Font.BOLD, 36));
        jFrame.setSize(500,400);//418 400
        JButton[][] buttons = new JButton[4][5];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setFont(new Font("Times",Font.BOLD, 36));
                buttons[i][j].setBounds(125 * i, 60*(j + 1), 125, 60);
                int i0 = i;
                int j0 = j;
                switch (i0) {
                    case 0 -> {
                        switch (j0) {
                            case 0 -> buttons[i0][j0].setText(" ");
                            case 1 -> buttons[i0][j0].setText("7");
                            case 2 -> buttons[i0][j0].setText("4");
                            case 3 -> buttons[i0][j0].setText("1");
                            case 4 -> buttons[i0][j0].setText(".");
                        }
                    }
                    case 1 -> {
                        switch (j0) {
                            case 0 -> buttons[i0][j0].setText("C");
                            case 1 -> buttons[i0][j0].setText("8");
                            case 2 -> buttons[i0][j0].setText("5");
                            case 3 -> buttons[i0][j0].setText("2");
                            case 4 -> buttons[i0][j0].setText("0");
                        }
                    }
                    case 2 -> {
                        switch (j0) {
                            case 0 -> buttons[i0][j0].setText("DEL");
                            case 1 -> buttons[i0][j0].setText("9");
                            case 2 -> buttons[i0][j0].setText("6");
                            case 3 -> buttons[i0][j0].setText("3");
                            case 4 -> buttons[i0][j0].setText("SPC");
                        }
                    }
                    case 3 -> {
                        switch (j0) {
                            case 0 -> buttons[i0][j0].setText("/");
                            case 1 -> buttons[i0][j0].setText("*");
                            case 2 -> buttons[i0][j0].setText("-");
                            case 3 -> buttons[i0][j0].setText("+");
                            case 4 -> buttons[i0][j0].setText("=");
                        }
                    }
                }
                buttons[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        calcResult.setText(CalcController.buttonMethod(model, buttons[i0][j0].getText(), calcResult.getText()));
                    }
                });
            }
        }
        jFrame.setLocationRelativeTo(null);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                jFrame.add(buttons[i][j]);
            }
        }
        jFrame.add(calcResult);
        jFrame.setVisible(true);
    }
    public static void Result(CalcModel model) {
        System.out.println(model);
    }
}
