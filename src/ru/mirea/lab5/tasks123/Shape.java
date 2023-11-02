package ru.mirea.lab5.tasks123;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(){};
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract double getArea();
    abstract double getPerimeter();
    @Override
    public String toString(){
        return "Shape @ color: "+this.color+", filled: "+this.filled;
    };
}
