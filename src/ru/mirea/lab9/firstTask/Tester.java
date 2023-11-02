package ru.mirea.lab9.firstTask;

public class Tester {
    public static void main(String[] args) {
        Nameable animal = new Animal("Mikky");
        Nameable tablet = new Tablet("HUAWEI");
        Nameable car = new Car("Honda");
        System.out.println(car.getName());
        System.out.println(animal.getName());
        System.out.println(tablet.getName());
    }
}
