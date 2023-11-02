package ru.mirea.lab9.secondTask;

public class Tablet implements Priceable {
    int cost;

    public Tablet(int cost) {
        this.cost = cost;
    }

    @Override
    public int getPrice() {
        return cost;
    }
}
