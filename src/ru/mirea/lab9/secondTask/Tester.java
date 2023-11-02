package ru.mirea.lab9.secondTask;

public class Tester {
    public static void main(String[] args) {
        Priceable smartphone = new Smartphone(500);
        Priceable tablet = new Tablet(1000);
        Priceable car = new Car(70000);
        System.out.println(car.getPrice());
        System.out.println(smartphone.getPrice());
        System.out.println(tablet.getPrice());
    }
}
