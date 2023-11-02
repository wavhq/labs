package ru.mirea.lab5.tasks123;

import java.lang.Math;

public class Circle extends Shape {
    protected double radius;
    public Circle(){
        this.filled = false;
        this.color = "Red";
        this.radius = 1.0;

    };

    public Circle(double radius){
        this.filled = false;
        this.color = "Red";
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.filled = filled;
        this.color = color;
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }
    @Override
    public double getPerimeter(){
        return Math.PI*2*radius;
    }
    @Override
    public String toString(){
        return "Circle @ color: " + this.color +
                ", filled: " + this.filled +
                ", radius: " + this.radius;
    };

}
