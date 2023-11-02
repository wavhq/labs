package ru.mirea.lab5.tasks45;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }
    public boolean equalSpeed(){
        if ((topLeft.ySpeed == bottomRight.ySpeed)&&(topLeft.xSpeed == bottomRight.xSpeed)) return true;
        else return false;
    }
    @Override
    public String toString(){
        return "MovablePoint @ ("+(topLeft.x-bottomRight.x)+", "+(topLeft.y-bottomRight.y)+")\nSpeed: ("+topLeft.xSpeed+", "+topLeft.ySpeed+")";
    }
    @Override
    public void moveUp(){
        topLeft.y+=topLeft.ySpeed;
        bottomRight.y+=bottomRight.ySpeed;
    }
    @Override
    public void moveDown(){
        topLeft.y-=topLeft.ySpeed;
        bottomRight.y-=bottomRight.ySpeed;
    }
    @Override
    public void moveLeft(){
        topLeft.x-=topLeft.xSpeed;
        bottomRight.x-=bottomRight.xSpeed;
    }
    @Override
    public void moveRight(){
        topLeft.x+=topLeft.xSpeed;
        bottomRight.x+=bottomRight.xSpeed;
    }
}
