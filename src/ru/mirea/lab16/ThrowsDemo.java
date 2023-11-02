package ru.mirea.lab16;


public class ThrowsDemo {
    public void getDetails(String key) {
        try{
            key+=key;
        }
        catch (NumberFormatException e){
            throw new NullPointerException("null key in getDetails");
        }
    }

    public static void main(String[] args) {
        ThrowsDemo throwsDemo = new ThrowsDemo();
        throwsDemo.getDetails(null);
    }
}

