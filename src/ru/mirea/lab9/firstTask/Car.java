package ru.mirea.lab9.firstTask;

public class Car implements Nameable{
    String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
