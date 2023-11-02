package ru.mirea.lab1;

public class Ball {
    private int size;
    private String color;
    private String sport_type;

    public Ball(){
        this.size = 7;
        this.color = "orange";
        this.sport_type = "Basketball";
    }

    public Ball(int size, String color, String sport_type){
        this.size = size;
        this.color = color;
        this.sport_type = sport_type;
    }

    public void bounce(){
        System.out.println("Bounce!");
    }

    public void set_size(int size){
        this.size = size;
    }

    public int get_size(){
        return size;
    }

    public void set_color(String color){
        this.color = color;
    }

    public String get_color(){
        return color;
    }

    public void set_sport_type(String sport_type){
        this.sport_type = sport_type;
    }

    public String get_sport_type(){
        return sport_type;
    }

    @Override
    public String toString(){
        return "This " + color + " ball is for " + sport_type + " its size is " + size;
    }
}
