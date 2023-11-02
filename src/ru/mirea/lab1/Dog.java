package ru.mirea.lab1;

public class Dog {
    private String name;
    private int age;

    public Dog(){
        this.name = "Sharik";
        this.age = 0;
    }

    public Dog(String name){
        this.name = name;
        this.age = 0;
    }

    public Dog(int age){
        this.name = "Sharik";
        if (age<0) this.age = 0;
        else this.age = age;
    }
    public Dog(String name, int age){
        this.name = name;
        if (age<0) this.age = 0;
        else this.age = age;
    }

    public void Bark(){
        System.out.println("Bark!");
    }

    public void set_name(String name){
        this.name = name;
    }

    public void set_age(int age){
        this.age = age;
    }

    public String get_name(){
        return name;
    }

    public int get_age(){
        return age;
    }

    @Override
    public String toString(){
        return "This dog name is " + name + " and dog is " + age + " y.o.";
    }
}
