package ru.mirea.lab8.PicWindow;

import ru.mirea.lab8.ShapeWindow.Circle;
import ru.mirea.lab8.ShapeWindow.Rectangle;
import ru.mirea.lab8.ShapeWindow.Shape;
import ru.mirea.lab8.ShapeWindow.ShapesWindow;

import javax.swing.*;
import java.awt.*;

public class PicWindow extends JFrame {

    public PicWindow(){
        super("PicWindow");
        setSize(1000, 750);
        setVisible(true);
    }

    public static class Painter extends JPanel{
        Image img;

        public Painter(String route){
            img = new ImageIcon(route).getImage();
        }

        @Override
        protected void paintComponent(java.awt.Graphics g) {
            g.drawImage(img, 0, 0 , null);
        }

    }

    public static void main(String[] args) {
        JFrame frame = new PicWindow();
        JPanel panel = new PicWindow.Painter(args[0]);
        panel.setBounds(0, 0 , 1000, 1000);
        frame.setContentPane(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
