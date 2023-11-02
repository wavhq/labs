package ru.mirea.lab7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MilanMadridTable extends JFrame{
    private int milanScore = 0;
    private int madridScore = 0;
    Font font = new Font("Arial", Font.BOLD, 20);
    JButton Milan = new JButton("AC Milan");
    JButton Madrid = new JButton("Real Madrid");
    JLabel Result = new JLabel("Result: " + milanScore + " X " + madridScore, SwingConstants.CENTER);
    JLabel LastScorer = new JLabel("Last Scorer: N/A", SwingConstants.CENTER);
    Label Winner = new Label("Winner: DRAW", SwingConstants.CENTER);

    JPanel j1 = new JPanel();
    JPanel j2 = new JPanel();
    JPanel j3 = new JPanel();
    JPanel j4 = new JPanel();
    JPanel j5 = new JPanel();
    JPanel j6 = new JPanel();
    JPanel j7 = new JPanel();
    JPanel j8 = new JPanel();
    JPanel j9 = new JPanel();
    JPanel j10 = new JPanel();

    public MilanMadridTable(){
        super("Milan vs Madrid");
        setLayout(new GridLayout(3,5));
        Dimension d = new Dimension(750, 300);
        setMinimumSize(d);
        setResizable(false);
        Result.setFont(font);
        Milan.setFont(font);
        Madrid.setFont(font);
        add(j1);
        add(j2);
        add(Winner);
        add(j3);
        add(j4);
        add(j5);
        add(Milan);
        add(Result);
        add(Madrid);
        add(j6);
        add(j7);
        add(j8);
        add(LastScorer);
        add(j9);
        add(j10);
        Color color = new Color(0xFF3DF3);
        Milan.setBackground(color);
        Milan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (milanScore<5 && madridScore<5){
                    milanScore++;
                    Result.setText("Result: " + milanScore + " X " + madridScore);
                    LastScorer.setText("Last Scorer: AC Milan");
                    if (milanScore>madridScore) Winner.setText("Winner: AC Milan");
                    else if (milanScore<madridScore) Winner.setText("Winner: Real Madrid");
                    else Winner.setText("Winner: DRAW");
                }


            }
        });
        Madrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (milanScore<5 && madridScore<5) {
                    madridScore++;
                    Result.setText("Result: " + milanScore + " X " + madridScore);
                    LastScorer.setText("Last Scorer: Real Madrid");
                    if (milanScore > madridScore) Winner.setText("Winner: AC Milan");
                    else if (milanScore < madridScore) Winner.setText("Winner: Real Madrid");
                    else Winner.setText("Winner: DRAW");
                }
            }
        });
        setVisible(true);
    }
}
