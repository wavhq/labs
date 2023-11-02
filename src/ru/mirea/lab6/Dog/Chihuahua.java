package ru.mirea.lab6.Dog;

public class Chihuahua extends Dog{
    public Chihuahua(String name, String color){
    this.color = color;
    this.size = "SMALL";
    this.name = name;
}

    @Override
    String bark() {
        return "taff! tau-taf!";
    }
}
