package ru.mirea.lab8.ShapeWindow;

import java.awt.*;

public class Square extends Rectangle {
    public Square(){
        this.length = 1;
        this.width = 1;
    }

    public Square(double side){
        this.length = side;
        this.width = side;
    }

    public Square(double side, int color, Point point){
        this.length = side;
        this.width = side;
        this.color = color;
        this.point = point;
    }
    public double getSide() {
        return length;
    }
    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }

}
