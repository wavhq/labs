package ru.mirea.lab22.task2;

public class ChairFactory implements AbstractChairFactory{
    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }

    @Override
    public MagicChair createMagicianChair() {
        return new MagicChair();
    }

    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair(100);
    }
}
