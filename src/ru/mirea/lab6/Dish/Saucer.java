package ru.mirea.lab6.Dish;

public class Saucer extends Dish{
    public Saucer(String color, String material){
        this.color = color;
        this.material = material;
    }

    @Override
    String makeDishCracked() {
        return "Dznn!";
    }

    @Override
    String getID() {
        return "SAUCER-"+color+"-"+material;
    }

    @Override
    public String toString() {
        return "Saucer @ "+material+" "+color;
    }
}
