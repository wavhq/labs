package ru.mirea.lab9.firstTask;

public class Animal implements Nameable{
    String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
