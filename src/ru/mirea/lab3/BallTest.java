package ru.mirea.lab3;

public class BallTest {
    public static void main(String[] args) {
        Ball ball1 = new Ball();
        Ball ball2 = new Ball(-6, 5);
        System.out.println("First ball: " + ball1);
        System.out.println("Second ball: " + ball2);
        ball1.setXY(34, 72);
        ball2.setY(13);
        System.out.println("First ball: " + ball1);
        System.out.println("Second ball: " + ball2);
        ball1.setX(14);
        ball2.move(-4.7, 15.3);
        System.out.println("First ball: " + ball1);
        System.out.println("Second ball: " + ball2);
    }
}
