package ru.mirea.lab6.Furniture;

public class Table extends Furniture{
    public Table(String color, String material){
        this.color = color;
        this.material = material;
    }

    @Override
    String getID() {
        return "TABLE-"+color+"-"+material;
    }

    @Override
    String openDoor() {
        return "*You've silently opened the door*";
    }
}
