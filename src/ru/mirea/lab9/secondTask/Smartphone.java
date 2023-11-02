package ru.mirea.lab9.secondTask;

public class Smartphone implements Priceable{
    int cost;

    public Smartphone(int cost) {
        this.cost = cost;
    }

    @Override
    public int getPrice() {
        return cost;
    }
}
