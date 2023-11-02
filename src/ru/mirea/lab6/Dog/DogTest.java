package ru.mirea.lab6.Dog;

public class DogTest {
    public static void main(String[] args) {
        Sheepdog sheepdog = new Sheepdog("Rex", "Brown");
        Chihuahua chihuahua = new Chihuahua("Mikki", "White");

        System.out.println(sheepdog.bark());
        System.out.println(chihuahua.bark());

        System.out.println(sheepdog);
        System.out.println(chihuahua);
    }

}
