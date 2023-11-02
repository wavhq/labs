package ru.mirea.lab6.Dish;

public abstract class Dish {
    protected String material, color;
    abstract String makeDishCracked();
    abstract String getID();

    @Override
    public String toString() {
        return "Dish @ "+material+" "+color;
    }
}
