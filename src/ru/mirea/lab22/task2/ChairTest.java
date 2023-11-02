package ru.mirea.lab22.task2;

public class ChairTest {
    public static void main(String[] args) {
        AbstractChairFactory factory = new ChairFactory();

        Chair magicChair = factory.createMagicianChair();
        Chair victorianChair = factory.createVictorianChair();
        Chair functionalChair = factory.createFunctionalChair();

        ((MagicChair)magicChair).doMagic();
        System.out.println(((VictorianChair)victorianChair).getAge());
        System.out.println(((FunctionalChair)functionalChair).sum(41,17));

        Client client = new Client();
        client.setChair(victorianChair);
        client.sit();
    }
}
