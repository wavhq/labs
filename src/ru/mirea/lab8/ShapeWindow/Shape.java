package ru.mirea.lab8.ShapeWindow;

import java.awt.*;

public abstract class Shape {
    protected int color;
    protected Point point;
    public Shape(){};
    public int getColor(){
        return color;
    }
    public void setColor(int color){
        this.color = color;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }
}
