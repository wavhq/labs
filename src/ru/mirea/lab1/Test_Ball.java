package ru.mirea.lab1;

public class Test_Ball {
    public static void main(String[] args) {
        Ball b1 = new Ball();
        Ball b2 = new Ball(5, "blue", "Waterpolo");

        b1.bounce();
        System.out.println(b1);
        System.out.println(b2);
    }
}
