package ru.mirea.lab5.tasks123;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(){
        this.length = 1;
        this.width = 2;
        this.color = "Red";
        this.filled = false;
    }

    public Rectangle(double width, double length){
        this.length = length;
        this.width = width;
        this.color = "Red";
        this.filled = false;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        this.length = length;
        this.width = width;
        this.color = color;
        this.filled = filled;
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

    @Override
    public double getArea(){
        return width*length;
    }
    @Override
    public double getPerimeter(){
        return 2*(width+length);
    }
    @Override
    public String toString(){
        return "Rectangle @ color: " + this.color +
                ", filled: " + this.filled +
                ", width: " + this.width +
                ", length: " + this.length;
    };
}
