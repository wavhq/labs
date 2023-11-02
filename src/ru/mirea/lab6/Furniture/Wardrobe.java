package ru.mirea.lab6.Furniture;

public class Wardrobe extends Furniture{
    public Wardrobe(String color, String material){
        this.color = color;
        this.material = material;
    }

    @Override
    String getID() {
        return "WARDROBE-"+color+"-"+material;
    }

    @Override
    String openDoor() {
        return "*You've creaky opened the door and there a man...*";
    }
}
