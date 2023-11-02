package ru.mirea.lab22.task1;

public class FactoryTest {
    public static void main(String[] args) {
        AbstractComplexFactory factory = new ConcreteFactory();
        Complex complex = factory.createComplex();
        System.out.println(complex);
    }
}
