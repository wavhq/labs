package ru.mirea.lab6.Dog;

public abstract class Dog {
    protected String name, color, size;
    abstract String bark();

    @Override
    public String toString() {
        return "Dog @ " + name + " " + color + " " + size;
    }
}
