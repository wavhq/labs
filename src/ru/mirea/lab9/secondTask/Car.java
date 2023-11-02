package ru.mirea.lab9.secondTask;

public class Car implements Priceable {
    int cost;

    public Car(int cost) {
        this.cost = cost;
    }

    @Override
    public int getPrice() {
        return cost;
    }
}
