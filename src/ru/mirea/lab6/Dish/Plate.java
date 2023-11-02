package ru.mirea.lab6.Dish;

public class Plate extends Dish{
    public Plate(String color, String material){
        this.color = color;
        this.material = material;
    }

    @Override
    String makeDishCracked() {
        return "Bdshhh!";
    }

    @Override
    String getID() {
        return "PLATE-"+color+"-"+material;
    }

    @Override
    public String toString() {
        return "Plate @ "+material+" "+color;
    }
}
