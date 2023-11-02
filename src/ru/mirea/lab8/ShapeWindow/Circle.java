package ru.mirea.lab8.ShapeWindow;

import java.awt.*;

public class Circle extends Shape {
    protected double width;
    protected double length;
    public Circle(double width, double length, int color, Point point){
        this.length = length;
        this.width = width;
        this.color = color;
        this.point = point;
    }
}
