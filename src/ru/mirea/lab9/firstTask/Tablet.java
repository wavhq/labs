package ru.mirea.lab9.firstTask;

public class Tablet implements Nameable{
    String name;

    public Tablet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
