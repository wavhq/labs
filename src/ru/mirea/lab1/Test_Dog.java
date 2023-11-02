package ru.mirea.lab1;

public class Test_Dog {
    public static void main(String[] args) {
        Dog firstDog = new Dog();
        Dog secondDog = new Dog(10);
        Dog thirdDog = new Dog("Rex", 5);

        thirdDog.Bark();
        System.out.println(firstDog);
        firstDog.set_age(2);
        System.out.println(firstDog);
        System.out.println(secondDog);
        System.out.println(thirdDog);
    }
}
