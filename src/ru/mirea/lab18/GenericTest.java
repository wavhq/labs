package ru.mirea.lab18;

import java.util.ArrayList;

public class GenericTest {
    public static void main(String[] args) {
        GenericClass<Integer, String, Double> genericClass = new GenericClass<>(12, "value", 12.3d);
        genericClass.printAll();
        GenericClassLimited<String, Animal, Double> genericClassLimited = new GenericClassLimited<>("string", new Animal(), 123.4d);
        genericClassLimited.printAll();

        ArrayList<String> a = new ArrayList<>();
        a.add("qweqwe");
        a.add("abc");
        a.add("aaa");
        MinMax<String> minMax = new MinMax<>(a);
        System.out.println(minMax.minimal());
        System.out.println(minMax.maximum());


        double intResult = Calculator.sum(5, 3);
        double doubleResult = Calculator.divide(10.0, 2.0);

        System.out.println("Sum: " + intResult);
        System.out.println("Division: " + doubleResult);



    }
}
