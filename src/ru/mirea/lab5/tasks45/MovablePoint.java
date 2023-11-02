package ru.mirea.lab5.tasks45;

public class MovablePoint implements Movable{
    public int x, y, xSpeed, ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    @Override
    public String toString(){
        return "MovablePoint @ ("+x+", "+y+")\nSpeed: ("+xSpeed+", "+ySpeed+")";
    }
    @Override
    public void moveUp(){
        y+=ySpeed;
    }
    @Override
    public void moveDown(){
        y-=ySpeed;
    }
    @Override
    public void moveLeft(){
        x-=xSpeed;
    }
    @Override
    public void moveRight(){
        x+=xSpeed;
    }
}
