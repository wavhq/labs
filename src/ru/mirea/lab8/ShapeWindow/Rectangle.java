package ru.mirea.lab8.ShapeWindow;

import java.awt.*;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(){
        this.length = 1;
        this.width = 2;
    }

    public Rectangle(double width, double length){
        this.length = length;
        this.width = width;
    }

    public Rectangle(double width, double length, int color, Point point){
        this.length = length;
        this.width = width;
        this.point = point;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

}
