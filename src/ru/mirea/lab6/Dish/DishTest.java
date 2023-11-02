package ru.mirea.lab6.Dish;

public class DishTest {
    public static void main(String[] args) {
        Plate plate = new Plate("red", "porcelain");
        Saucer saucer = new Saucer("blue", "plastic");
        System.out.println(plate);
        System.out.println(saucer);
        System.out.println(saucer.getID());
        System.out.println(plate.getID());
    }
}
