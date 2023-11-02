package ru.mirea.lab5.tasks123;

public class Square extends Rectangle {
    public Square(){
        this.length = 1;
        this.width = 1;
        this.color = "Red";
        this.filled = false;
    }

    public Square(double side){
        this.length = side;
        this.width = side;
        this.color = "Red";
        this.filled = false;
    }

    public Square(double side, String color, boolean filled){
        this.length = side;
        this.width = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide() {
        return length;
    }
    public void setSide(double side) {
        this.length = side;
        this.width = side;
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
        return "Square @ color: " + this.color +
                ", filled: " + this.filled +
                ", width: " + this.width +
                ", length: " + this.length;
    };

}
