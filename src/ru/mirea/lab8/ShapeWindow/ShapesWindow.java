package ru.mirea.lab8.ShapeWindow;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ShapesWindow extends JFrame {
    public static int colorGenerator(){
        return (int)(Math.random()*16777215);
    }

    public static void getDimensionToShape(Shape s){
        Dimension d = new Dimension((int)(Math.random()*50), (int)(Math.random()*50));
    }

    public static class Graphics extends JPanel{
        ArrayList<Shape> shapes = new ArrayList<>();
        public Graphics(){
            for (int i = 0; i < 20; i++) {
                if (((int)(Math.random()*100))%2 == 0) shapes.add(new Circle((int)(Math.random()*100), (int)(Math.random()*100), colorGenerator(), new Point((int)(Math.random()*750), (int)(Math.random()*500))));
                else shapes.add(new Rectangle((int)(Math.random()*100), (int)(Math.random()*100), colorGenerator(), new Point((int)(Math.random()*750), (int)(Math.random()*500))));
            }
        }
        @Override
        protected void paintComponent(java.awt.Graphics g) {
            for (Shape s: shapes) {
                if (s.getClass().getName() == "ru.mirea.lab8.ShapeWindow.Circle"){
                    g.setColor(new Color(colorGenerator()));
                    g.fillOval(s.point.x, s.point.y, (int)((Circle)s).width, (int)((Circle)s).length);
                }
                else {
                    g.setColor(new Color(colorGenerator()));
                    g.fillRect(s.point.x, s.point.y, (int)((Rectangle)s).width, (int)((Rectangle)s).length);
                }
            }

        }
    }

    public ShapesWindow(){
        super ("Shapes Window");
        setMinimumSize(new Dimension(1000, 750));
        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame frame = new ShapesWindow();
        JPanel panel = new Graphics();
        frame.setContentPane(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
