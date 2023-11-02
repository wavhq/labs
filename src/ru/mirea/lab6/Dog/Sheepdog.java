package ru.mirea.lab6.Dog;

public class Sheepdog extends Dog{
    public Sheepdog(String name, String color){
        this.color = color;
        this.size = "BIG";
        this.name = name;
    }

    @Override
    String bark() {
        return "WAF!! WAF-WAF!!";
    }
}
