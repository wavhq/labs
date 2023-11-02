package ru.mirea.lab4;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(10, 0.2f, 14.5f);
        System.out.println(circle);
        circle.setX(1.2f);
        circle.setRadius(0.15f);
        System.out.println(circle);
    }
}
