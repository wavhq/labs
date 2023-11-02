package ru.mirea.lab5.tasks45;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    @Override
    public String toString(){
        return "MovableCircle @ ("+center.x+", "+center.y+")\nSpeed: ("+center.xSpeed+", "+center.ySpeed+")";
    }
    @Override
    public void moveUp(){
        center.y+=center.ySpeed;
    }
    @Override
    public void moveDown(){
        center.y-=center.ySpeed;
    }
    @Override
    public void moveLeft(){
        center.x-=center.xSpeed;
    }
    @Override
    public void moveRight(){
        center.x+=center.xSpeed;
    }
}
