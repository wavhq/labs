package ru.mirea.lab6.Furniture;

public abstract class Furniture {
    protected String material, color;
    abstract String getID();
    abstract String openDoor();

    @Override
    public String toString() {
        return "Furniture @ "+material+" "+color;
    }
}
